/*
 * Copyright 2016-2018 Litsec AB
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
package se.litsec.eidas.opensaml2.metadata;

import javax.xml.namespace.QName;

import org.opensaml.common.SAMLObject;

import se.litsec.eidas.opensaml2.common.EidasConstants;

/**
 * Representation of the {@code IssuerName} element.
 * 
 * @author Martin Lindström (martin.lindstrom@litsec.se)
 */
public interface IssuerName extends SAMLObject {

  /** Element local name. */
  public static final String DEFAULT_ELEMENT_LOCAL_NAME = "IssuerName";

  /** Default element name. */
  public static final QName DEFAULT_ELEMENT_NAME = new QName(EidasConstants.EIDAS_SERVICELIST_NS, DEFAULT_ELEMENT_LOCAL_NAME,
    EidasConstants.EIDAS_SERVICELIST_PREFIX);

  /**
   * Returns the name
   * 
   * @return the name
   */
  String getValue();

  /**
   * Assigns the name
   * 
   * @param value
   *          the name
   */
  void setValue(String value);

}
