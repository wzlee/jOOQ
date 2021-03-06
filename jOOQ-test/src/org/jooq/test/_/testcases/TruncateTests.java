/**
 * Copyright (c) 2009-2013, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */
package org.jooq.test._.testcases;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import static org.jooq.SQLDialect.CUBRID;
import static org.jooq.SQLDialect.FIREBIRD;
// ...
import static org.jooq.SQLDialect.SQLITE;

import java.sql.Date;
import java.util.Arrays;

import org.jooq.InsertResultStep;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Record6;
import org.jooq.TableRecord;
import org.jooq.UpdatableRecord;
import org.jooq.test.BaseTest;
import org.jooq.test.jOOQAbstractTest;

import org.junit.Test;

public class TruncateTests<
    A    extends UpdatableRecord<A> & Record6<Integer, String, String, Date, Integer, ?>,
    AP,
    B    extends UpdatableRecord<B>,
    S    extends UpdatableRecord<S> & Record1<String>,
    B2S  extends UpdatableRecord<B2S> & Record3<String, Integer, Integer>,
    BS   extends UpdatableRecord<BS>,
    L    extends TableRecord<L> & Record2<String, String>,
    X    extends TableRecord<X>,
    DATE extends UpdatableRecord<DATE>,
    BOOL extends UpdatableRecord<BOOL>,
    D    extends UpdatableRecord<D>,
    T    extends UpdatableRecord<T>,
    U    extends TableRecord<U>,
    UU   extends UpdatableRecord<UU>,
    I    extends TableRecord<I>,
    IPK  extends UpdatableRecord<IPK>,
    T725 extends UpdatableRecord<T725>,
    T639 extends UpdatableRecord<T639>,
    T785 extends TableRecord<T785>>
extends BaseTest<A, AP, B, S, B2S, BS, L, X, DATE, BOOL, D, T, U, UU, I, IPK, T725, T639, T785> {

    public TruncateTests(jOOQAbstractTest<A, AP, B, S, B2S, BS, L, X, DATE, BOOL, D, T, U, UU, I, IPK, T725, T639, T785> delegate) {
        super(delegate);
    }

    @Test
    public void testTruncate() throws Exception {
        jOOQAbstractTest.reset = false;

        try {
            create().truncate(TAuthor()).execute();

            // The above should fail if foreign keys are supported
            if (!Arrays.asList(CUBRID, FIREBIRD, SQLITE).contains(dialect())) {
                fail();
            }
        } catch (Exception expected) {
        }

        // This is being tested with an unreferenced table as some RDBMS don't
        // Allow this
        create().truncate(TDates()).execute();
        assertEquals(0, create().fetch(TDates()).size());
    }

    @Test
    public void testTruncateCascade() throws Exception {
        switch (dialect().family()) {
            /* [pro] xx
            xxxx xxxx
            xxxx xxxx
            xxxx xxxxxxx
            xxxx xxxxxxx
            xxxx xxxxxxxxxx
            xxxx xxxxxxx
            xx [/pro] */
            case CUBRID:
            case DERBY:
            case FIREBIRD:
            case H2:
            case HSQLDB:
            case MARIADB:
            case MYSQL:
            case SQLITE:
                log.info("SKIPPING", "TRUNCATE CASCADE tests");
                return;
        }

        jOOQAbstractTest.reset = false;

        try {
            create().truncate(TAuthor())
                    .restrict()
                    .execute();
        } catch (Exception expected) {
        }

        // This is being tested with an unreferenced table as some RDBMS don't
        // Allow this
        create().truncate(TAuthor())
                .cascade()
                .execute();
        assertEquals(0, create().fetch(TAuthor()).size());
        assertEquals(0, create().fetch(TBook()).size());
    }

    @Test
    public void testTruncateRestartIdentity() throws Exception {
        switch (dialect().family()) {
            /* [pro] xx
            xxxx xxxx
            xxxx xxxx
            xxxx xxxxxxx
            xxxx xxxxxxx
            xxxx xxxxxxxxxx
            xxxx xxxxxxx
            xx [/pro] */
            case CUBRID:
            case DERBY:
            case FIREBIRD:
            case H2:
            case MARIADB:
            case MYSQL:
            case SQLITE:
                log.info("SKIPPING", "RESTART IDENTITY tests");
                return;
        }

        jOOQAbstractTest.reset = false;

        InsertResultStep<I> insert =
        create().insertInto(TIdentity(), TIdentity_VAL())
                .values(1)
                .returning(TIdentity_ID());
        int id1 = insert.fetchOne().getValue(TIdentity_ID());


        create().truncate(TIdentity())
                .continueIdentity()
                .execute();
        int id2 = insert.fetchOne().getValue(TIdentity_ID());
        assertEquals(id1 + 1, id2);


        create().truncate(TIdentity())
                .restartIdentity()
                .execute();
        int id3 = insert.fetchOne().getValue(TIdentity_ID());
        assertEquals(1, id3);
    }
}
