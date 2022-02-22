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
package com.valantic.intellij.plugin.mutation.localization;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * created by fabian.huesig on 2022-02-01
 */
public class MessagesTest
{

	@Test
	public void getMessages()
	{
		assertEquals("test value", Messages.getMessage("key.test"));
		assertEquals("key.does.not.exist", Messages.getMessage("key.does.not.exist"));
	}
}