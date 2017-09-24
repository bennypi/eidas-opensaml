/*
 * The eidas-opensaml project is an open-source package that extends OpenSAML
 * with definitions for the eIDAS Framework.
 *
 * More details on <https://github.com/litsec/eidas-opensaml>
 * Copyright (C) 2016-2017 Litsec AB
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package se.litsec.eidas.opensaml.ext.attributes;

import javax.xml.namespace.QName;

import se.litsec.eidas.opensaml.common.EidasConstants;

/**
 * The eIDAS {@code BirthNameType}.
 * 
 * <pre>
 * {@code 
 * <xsd:complexType name="BirthNameType">
 *   <xsd:annotation>
 *     <xsd:documentation>
 *       First name(s) and family name(s) of the natural person at birth.
 *     </xsd:documentation>
 *   </xsd:annotation>
 *   <xsd:simpleContent>
 *     <xsd:extension base="xsd:string">
 *       <xsd:attribute ref="LatinScript" />
 *     </xsd:extension>
 *   </xsd:simpleContent>
 * </xsd:complexType>}
 * </pre>
 * 
 * Example:
 * <pre>{@code
 * <saml:Attribute
 *       FriendlyName="BirthName"
 *       Name="http://eidas.europa.eu/attributes/naturalperson/BirthName"
 *       NameFormat="urn:oasis:names:tc:SAML:2.0:attrname-format:uri">
 *   <saml:AttributeValue xsi:type="eidas:BirthNameType">
 *     Sarah Jane Booth
 *   </saml:AttributeValue
 * </saml:Attribute>}
 * </pre>
 * 
 * @author Martin Lindström (martin.lindstrom@litsec.se)
 */
public interface BirthNameType extends TransliterationStringType {
  
  /** Local name of the XSI type. */
  public static final String TYPE_LOCAL_NAME = "BirthNameType"; 
      
  /** QName of the XSI type. */
  public static final QName TYPE_NAME = new QName(EidasConstants.EIDAS_NP_NS, TYPE_LOCAL_NAME, EidasConstants.EIDAS_NP_PREFIX);  
}
