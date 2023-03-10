/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2020 GwtMaterialDesign
 * %%
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
 * #L%
 */
package your.company.domain.client.application;

import your.company.domain.client.resources.AppResources;
import gwt.material.design.client.theme.dark.DarkThemeLoader;

public class AppDarkThemeLoader extends DarkThemeLoader {

    public AppDarkThemeLoader() {
        super(AppResources.INSTANCE.appDarkCss());
    }
}
