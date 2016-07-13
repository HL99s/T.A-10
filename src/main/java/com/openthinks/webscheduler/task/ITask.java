/**   
 *  Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
* @Title: ITask.java 
* @Package com.openthinks.webscheduler.task 
* @Description: TODO
* @author dailey.yet@outlook.com  
* @date Jul 8, 2016
* @version V1.0   
*/
package com.openthinks.webscheduler.task;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author dailey.yet@outlook.com
 *
 */
public interface ITask extends Job {
	String TASK_REF = "task-ref";

	@Override
	public default void execute(JobExecutionContext context) throws JobExecutionException {
		execute(new TaskContext(context));
	}

	public void execute(TaskContext context);

}