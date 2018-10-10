/*
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.cos.cas.authentication;

import javax.security.auth.login.AccountException;

/**
 * Describes an error condition where authentication occurs from an registered but not confirmed account.
 *
 * @author Michael Haselton
 * @author Longze Chen
 * @since 4.1.5
 */
public class LoginNotAllowedException extends AccountException {

    private static final long serialVersionUID = 3376259469680697722L;

    /** Instantiates a new exception (default). */
    public LoginNotAllowedException() {
        super();
    }

    /**
     * Instantiates a new exception with a given message.
     *
     * @param message the message
     */
    public LoginNotAllowedException(final String message) {
        super(message);
    }
}
