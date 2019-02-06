
/*
 * Copyright (C) 2012-2014 Typesafe Inc. <http://www.typesafe.com>
 */

package scala.compat.java8;

@FunctionalInterface
public interface JFunction12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> extends scala.Function12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R>, java.io.Serializable {
    default void $init$() {
    };

    @SuppressWarnings("unchecked")
    default scala.Function1<T1, scala.Function1<T2, scala.Function1<T3, scala.Function1<T4, scala.Function1<T5, scala.Function1<T6, scala.Function1<T7, scala.Function1<T8, scala.Function1<T9, scala.Function1<T10, scala.Function1<T11, scala.Function1<T12, R>>>>>>>>>>>> curried() {
        throw new UnsupportedOperationException("todo");
    }

    @SuppressWarnings("unchecked")
    default scala.Function1<scala.Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, R> tupled() {
        throw new UnsupportedOperationException("todo");
    }


}
