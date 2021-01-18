/*
 * Copyright 2016-2021 Litsec AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package se.litsec.eidas.opensaml.ext.attributes;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Element;

import se.litsec.eidas.opensaml.OpenSAMLTestBase;

/**
 * Test cases for {@link PlaceOfBirthType}.
 * 
 * @author Martin Lindström (martin.lindstrom@litsec.se)
 */
public class PlaceOfBirthTypeTest extends OpenSAMLTestBase {

  /**
   * Test to marhall and unmarshall the object.
   * 
   * @throws Exception
   *           for errors
   */
  @Test
  public void testMarshallUnmarshall() throws Exception {

    PlaceOfBirthType pbt = OpenSAMLTestBase.createSamlObject(PlaceOfBirthType.class, PlaceOfBirthType.TYPE_NAME);
    pbt.setValue("Stockholm");

    Assert.assertEquals("Stockholm", pbt.getValue());

    Element element = OpenSAMLTestBase.marshall(pbt);
    Assert.assertNotNull(element);

    PlaceOfBirthType pbt2 = OpenSAMLTestBase.unmarshall(element, PlaceOfBirthType.class);
    Assert.assertEquals(pbt.getValue(), pbt2.getValue());
    Assert.assertEquals(pbt.getElementQName(), pbt2.getElementQName());
  }

}
