package com.arquillian.test.example.project.client.serdes.v1_0;

import com.arquillian.test.example.project.client.dto.v1_0.Steps;
import com.arquillian.test.example.project.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author vinicius
 * @generated
 */
@Generated("")
public class StepsSerDes {

	public static Steps toDTO(String json) {
		StepsJSONParser stepsJSONParser = new StepsJSONParser();

		return stepsJSONParser.parseToDTO(json);
	}

	public static Steps[] toDTOs(String json) {
		StepsJSONParser stepsJSONParser = new StepsJSONParser();

		return stepsJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Steps steps) {
		if (steps == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (steps.getDescription() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(steps.getDescription()));

			sb.append("\"");
		}

		if (steps.getStep() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"step\": ");

			sb.append("\"");

			sb.append(_escape(steps.getStep()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		StepsJSONParser stepsJSONParser = new StepsJSONParser();

		return stepsJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Steps steps) {
		if (steps == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (steps.getDescription() == null) {
			map.put("description", null);
		}
		else {
			map.put("description", String.valueOf(steps.getDescription()));
		}

		if (steps.getStep() == null) {
			map.put("step", null);
		}
		else {
			map.put("step", String.valueOf(steps.getStep()));
		}

		return map;
	}

	public static class StepsJSONParser extends BaseJSONParser<Steps> {

		@Override
		protected Steps createDTO() {
			return new Steps();
		}

		@Override
		protected Steps[] createDTOArray(int size) {
			return new Steps[size];
		}

		@Override
		protected void setField(
			Steps steps, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "description")) {
				if (jsonParserFieldValue != null) {
					steps.setDescription((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "step")) {
				if (jsonParserFieldValue != null) {
					steps.setStep((String)jsonParserFieldValue);
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}