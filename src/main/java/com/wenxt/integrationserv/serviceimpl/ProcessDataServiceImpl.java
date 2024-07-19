package com.wenxt.integrationserv.serviceimpl;

import java.sql.ResultSet;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import com.wenxt.integrationserv.dto.ProcedureInput;
import com.wenxt.integrationserv.service.ProcessDataService;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class ProcessDataServiceImpl implements ProcessDataService {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${spring.message.code}")
	private String messageCode;

	@Value("${spring.status.code}")
	private String statusCode;

	@Value("${spring.data.total}")
	private String totalcode;

	@Value("${spring.success.code}")
	private String successCode;

	@Value("${spring.error.code}")
	private String errorCode;

	@Value("${spring.warning.code}")
	private String warningCode;

	@Value("${spring.data.code}")
	private String dataCode;

	@Override
	public String invokeProcedure(String procedureName, String packageName, ProcedureInput procedureInput,
			HttpServletRequest request) {

		JSONObject response = new JSONObject();

		if (packageName == null || packageName.isEmpty() == true) {
			SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName(procedureName);

			try {
				Map<String, Object> outParams = simpleJdbcCall.execute(procedureInput.getInParams());
				SqlParameterSource parameterSource = new MapSqlParameterSource();

				ResultSet resultSet = simpleJdbcCall.getJdbcTemplate().getDataSource().getConnection().getMetaData()
						.getProcedureColumns(null, null, procedureName, null);

				while (resultSet.next()) {
					String parameterName = resultSet.getString("COLUMN_NAME");
					int parameterType = resultSet.getInt("COLUMN_TYPE");

					if (parameterType == 1) {

					} else if (parameterType == 4) {

					}
				}
				System.out.println(outParams);

				System.out.println(outParams.size());
				if (outParams.size() > 0) {
					response.put(statusCode, successCode);
					response.put(dataCode, outParams);

				} else {
					response.put(statusCode, errorCode);
					response.put(messageCode, "For the Selected Claim Type No Value's Present");
				}
			} catch (Exception e) {
				e.printStackTrace();
				response.put(statusCode, errorCode);
				response.put(messageCode, e.getMessage());
			}
		} else {
			SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName(packageName)
					.withProcedureName(procedureName);
			try {
				Map<String, Object> outParams = simpleJdbcCall.execute(procedureInput.getInParams());

				response.put(statusCode, successCode);
				response.put(dataCode, outParams);
			} catch (Exception e) {
				e.printStackTrace();
				response.put(statusCode, errorCode);
				response.put(messageCode, e.getMessage());
			}
		}

		return response.toString();
	}
}
