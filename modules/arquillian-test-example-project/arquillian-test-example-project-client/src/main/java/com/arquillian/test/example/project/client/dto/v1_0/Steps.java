package com.arquillian.test.example.project.client.dto.v1_0;

import com.arquillian.test.example.project.client.function.UnsafeSupplier;
import com.arquillian.test.example.project.client.serdes.v1_0.StepsSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author vinicius
 * @generated
 */
@Generated("")
public class Steps implements Cloneable, Serializable {

	public static Steps toDTO(String json) {
		return StepsSerDes.toDTO(json);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDescription(
		UnsafeSupplier<String, Exception> descriptionUnsafeSupplier) {

		try {
			description = descriptionUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String description;

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}

	public void setStep(UnsafeSupplier<String, Exception> stepUnsafeSupplier) {
		try {
			step = stepUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String step;

	@Override
	public Steps clone() throws CloneNotSupportedException {
		return (Steps)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Steps)) {
			return false;
		}

		Steps steps = (Steps)object;

		return Objects.equals(toString(), steps.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return StepsSerDes.toJSON(this);
	}

}