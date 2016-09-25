/*
 * The eidas-opensaml project is an open-source package that extends OpenSAML
 * with definitions for the eIDAS Framework.
 *
 * More details on <https://github.com/litsec/eidas-opensaml>
 * Copyright (C) 2016 Litsec AB
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
package se.litsec.eidas.opensaml.ext.attributes.address.impl;

import org.opensaml.core.xml.AbstractXMLObjectBuilder;

import se.litsec.eidas.opensaml.common.EidasConstants;
import se.litsec.eidas.opensaml.ext.attributes.address.LocatorDesignator;

/**
 * Builder for {@code LocatorDesignator}.
 * 
 * @author Martin Lindström (martin.lindstrom@litsec.se)
 */
public class LocatorDesignatorBuilder extends AbstractXMLObjectBuilder<LocatorDesignator> {

  /** {@inheritDoc} */
  public LocatorDesignator buildObject() {
    return buildObject(EidasConstants.EIDAS_NP_NS, LocatorDesignator.DEFAULT_ELEMENT_LOCAL_NAME,
      EidasConstants.EIDAS_NP_PREFIX);
  }

  /** {@inheritDoc} */
  @Override
  public LocatorDesignator buildObject(String namespaceURI, String localName, String namespacePrefix) {
    return new LocatorDesignatorImpl(namespaceURI, localName, namespacePrefix);
  }

}
