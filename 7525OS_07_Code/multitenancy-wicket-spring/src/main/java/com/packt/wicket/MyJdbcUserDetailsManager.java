/*
 * Copyright 2013 anjana.m.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.packt.wicket;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
/**
 *
 * @author anjana.m
 */
public class MyJdbcUserDetailsManager extends JdbcUserDetailsManager{

    @Override
    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        super.setAuthenticationManager(authenticationManager);
    }

    @Override
    protected String getRolePrefix() {
        return super.getRolePrefix();
    }

    @Override
    public String getUsersByUsernameQuery() {
        return super.getUsersByUsernameQuery();
    }
    
}
