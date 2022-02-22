/*
 * Copyright [2022] [valantic CEC Schweiz AG]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Written by Fabian Hüsig <fabian.huesig@cec.valantic.com>, February, 2022
 */
package com.valantic.intellij.plugin.mutation.services;

import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;
import com.valantic.intellij.plugin.mutation.services.impl.UtilService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockedStatic;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;


/**
 * created by fabian.huesig on 2022-02-01
 */
@RunWith(MockitoJUnitRunner.class)
public class ServicesTest {
    private MockedStatic<ApplicationManager> applicationManagerMockedStatic;

    @Before
    public void setUp() {
        applicationManagerMockedStatic = mockStatic(ApplicationManager.class);
    }

    @Test
    public void testGetService() {
        Application application = mock(Application.class);
        UtilService utilService = mock(UtilService.class);
        applicationManagerMockedStatic.when(ApplicationManager::getApplication).thenReturn(application);
        when(application.getService(UtilService.class)).thenReturn(utilService);

        assertSame(utilService, Services.getService(UtilService.class));
    }

    @After
    public void tearDown() {
        applicationManagerMockedStatic.close();
    }
}

