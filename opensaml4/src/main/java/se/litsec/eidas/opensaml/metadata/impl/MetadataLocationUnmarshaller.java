/*
 * Copyright 2016-2020 Litsec AB
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
package se.litsec.eidas.opensaml.metadata.impl;

import org.opensaml.core.xml.XMLObject;
import org.opensaml.core.xml.io.UnmarshallingException;
import org.opensaml.saml.common.AbstractSAMLObjectUnmarshaller;
import org.opensaml.xmlsec.signature.KeyInfo;
import org.w3c.dom.Attr;

import se.litsec.eidas.opensaml.metadata.Endpoint;
import se.litsec.eidas.opensaml.metadata.MetadataLocation;

/**
 * Unmarshaller for {@link MetadataLocation}.
 * 
 * @author Martin Lindström (martin.lindstrom@litsec.se)
 */
public class MetadataLocationUnmarshaller extends AbstractSAMLObjectUnmarshaller {

  /** {@inheritDoc} */
  @Override
  protected void processChildElement(XMLObject parentSAMLObject, XMLObject childSAMLObject)
      throws UnmarshallingException {

    MetadataLocation mdl = (MetadataLocation) parentSAMLObject;

    if (childSAMLObject instanceof Endpoint) {
      mdl.getEndpoints().add((Endpoint) childSAMLObject);
    }
    else if (childSAMLObject instanceof KeyInfo) {
      mdl.setKeyInfo((KeyInfo) childSAMLObject);
    }
    else {
      super.processChildElement(parentSAMLObject, childSAMLObject);
    }
  }

  /** {@inheritDoc} */
  @Override
  protected void processAttribute(XMLObject samlObject, Attr attribute) throws UnmarshallingException {

    MetadataLocation mdl = (MetadataLocation) samlObject;

    if (attribute.getLocalName().equals(MetadataLocation.LOCATION_ATTR_NAME)) {
      mdl.setLocation(attribute.getValue());
    }
    else {
      this.processUnknownAttribute(mdl, attribute);
    }    

  }

}
