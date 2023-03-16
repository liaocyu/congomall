/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opengoofy.congomall.flow.monitor.core.define;

import java.lang.reflect.Method;

/**
 * 类切面增强定义
 *
 * @author chen.ma
 * @github <a href="https://github.com/opengoofy" />
 * @公众号 马丁玩编程，关注回复：资料，领取面试常问技术和视频教学
 */
public interface InstanceMethodsAroundInterceptor {
    
    /**
     * 在目标方法执行前调用
     */
    void beforeMethod(Object obj, Method method, Object[] allArguments, Class<?>[] argumentsTypes) throws Throwable;
    
    /**
     * 在目标方法执行后调用
     */
    void afterMethod(Object obj, Method method, Object[] allArguments, Class<?>[] argumentsTypes, Object result, Throwable ex) throws Throwable;
}
