package com.wenxt.integrationserv.serviceimpl;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.integrationserv.model.YiSectionDetail;
import com.wenxt.integrationserv.repo.YI_SECTION_DETAILRepo;
import com.wenxt.integrationserv.service.YiSectionService;

@Service
public class YiSectionServiceimpl implements YiSectionService {

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

	@Autowired
	private YI_SECTION_DETAILRepo sectionrepo;

	@Override
	public String YiSectionCreate(String payload) {

		JSONObject response = new JSONObject();

		try {
			JSONObject jsonPayload = new JSONObject(payload);
			JSONArray entitiesArray = jsonPayload.getJSONArray("payload");

			Field[] fields = YiSectionDetail.class.getDeclaredFields();

			List<YiSectionDetail> entities = new ArrayList<>();
			for (int i = 0; i < entitiesArray.length(); i++) {
				JSONObject entityJson = entitiesArray.getJSONObject(i);
				YiSectionDetail entity = new YiSectionDetail();

				for (Field field : fields) {
					String fieldName = field.getName();
					if (entityJson.has(fieldName)) {
						field.setAccessible(true);

						if (field.getType() == String.class) {
							field.set(entity, entityJson.getString(fieldName));
						} else if (field.getType() == Integer.class || field.getType() == int.class) {
							field.set(entity, entityJson.getInt(fieldName));
						} else if (field.getType() == Double.class || field.getType() == double.class) {
							field.set(entity, entityJson.getDouble(fieldName));
						} else if (field.getType() == Long.class || field.getType() == long.class) {
							field.set(entity, entityJson.getLong(fieldName));
						} else if (field.getType() == Short.class || field.getType() == short.class) {
							if (!entityJson.isNull(fieldName)) {
								field.set(entity, (short) entityJson.getInt(fieldName));
							}
						} else if (field.getType() == LocalDateTime.class) {
							if (!entityJson.isNull(fieldName)) {
								field.set(entity, LocalDateTime.parse(entityJson.getString(fieldName)));
							}
						} else if (field.getType() == Date.class) {
							if (!entityJson.isNull(fieldName)) {
								field.set(entity, convertToDateType(entityJson.getString(fieldName), Date.class));
							}
						} else if (field.getType() == Timestamp.class) {
							if (!entityJson.isNull(fieldName)) {
								field.set(entity, convertToDateType(entityJson.getString(fieldName), Timestamp.class));
							}
						}
					}
				}

				entities.add(entity);
			}

			List<YiSectionDetail> savedEntities = sectionrepo.saveAll(entities);
			int count = savedEntities.size();

			response.put(statusCode, successCode);
			response.put(messageCode, "YI Section Inserted Successfully");
			response.put(totalcode, count);

		} catch (Exception e) {

			response.put(statusCode, errorCode);
			response.put(messageCode, "An error occurred: " + e.getMessage());
		}

		return response.toString();

	}

	private <T> T convertToDateType(String dateString, Class<T> type) {
		SimpleDateFormat dateFormat;
		if (type.equals(Date.class)) {
			dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		} else if (type.equals(Timestamp.class)) {
			dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		} else {
			throw new IllegalArgumentException("Unsupported date type: " + type);
		}

		try {
			Date parsedDate = dateFormat.parse(dateString);
			if (type.equals(Date.class)) {
				return type.cast(parsedDate);
			} else if (type.equals(Timestamp.class)) {
				return type.cast(new Timestamp(parsedDate.getTime()));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return null;
	}

}
