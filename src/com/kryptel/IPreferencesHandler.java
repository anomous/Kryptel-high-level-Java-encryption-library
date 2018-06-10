/*******************************************************************************

  Product:       Kryptel/Java
  File:          IPreferencesHandler.java

  Copyright (c) 2017 Inv Softworks LLC,    http://www.kryptel.com

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.

*******************************************************************************/


package  com.kryptel;


public interface IPreferencesHandler {
	
	public void SetHandler(IPreferences handler);
	
	public interface IPreferences {
		void SetInteger(String key, int val) throws Exception;
		void SetString(String key, String str) throws Exception;
		
		int GetInteger(String key, int defaultVal) throws Exception;
		String GetString(String key, String defaultStr) throws Exception;
		
		void Remove(String key) throws Exception;
		
		void Flush() throws Exception;
	}
}
