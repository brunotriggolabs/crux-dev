/*
 * Copyright 2014 cruxframework.org.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.cruxframework.crux.core.client.dataprovider;

import org.cruxframework.crux.core.client.event.BaseEvent;

public class DataChangedEvent extends BaseEvent<DataProvider<?>>
{
	private DataProviderRecord<?> currentRecord;
	private int recordPosition;
	
	protected DataChangedEvent(DataProvider<?> source,  DataProviderRecord<?> currentRecord, int recordPosition)
    {
	    super(source);
	    this.currentRecord = currentRecord;
		this.recordPosition = recordPosition;
    }

	public DataProviderRecord<?> getCurrentRecord()
	{
		return currentRecord;
	}

	public int getRecordPosition()
	{
		return recordPosition;
	}
}
