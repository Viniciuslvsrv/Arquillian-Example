package com.arquillian.test.example.project.client.function;

import javax.annotation.Generated;

/**
 * @author vinicius
 * @generated
 */
@FunctionalInterface
@Generated("")
public interface UnsafeSupplier<T, E extends Throwable> {

	public T get() throws E;

}