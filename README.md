![Logo](https://litsec.github.io/eidas-opensaml/img/litsec-small.png)

------

# eidas-opensaml

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/se.litsec.eidas/eidas-opensaml3/badge.svg)](https://maven-badges.herokuapp.com/maven-central/se.litsec.eidas/eidas-opensaml3) 

<!-- [![Known Vulnerabilities](https://snyk.io/test/github/litsec/eidas-opensaml/badge.svg?targetFile=opensaml3%2Fpom.xml)](https://snyk.io/test/github/litsec/eidas-opensaml?targetFile=opensaml3%2Fpom.xml) -->

OpenSAML extensions for the eIDAS Framework.

eIDAS (EU REGULATION [910/2014](http://eur-lex.europa.eu/legal-content/EN/TXT/HTML/?uri=CELEX:32014R0910&from=EN) on electronic identification and trust services for electronic transactions in the European internal market) defines requirements on cross-border recognition of electronic identification means in EU.

The eIDAS technical specifications defines a number of SAML elements and attribute definitions which are normally not supported by standard SAML software. The **eidas-opensaml** Open Source Java library extends the OpenSAML 3.X framework with support for the definitions from the eIDAS technical specifications.

The following eIDAS specifications are implemented:
* [eIDAS - Interoperability Architechture v1.2](https://github.com/litsec/eidas-opensaml/files/3236262/2019_05_23_eIDAS.Interoperability.Architecture.v1.2_Final2_CT.pdf)

* [ eIDAS - Cryptographic requirements for the Interoperability Framework v1.2](https://github.com/litsec/eidas-opensaml/files/3236260/2019_05_21_eIDAS.Crypto.Requirements_v1.2_Final2.pdf)

* [eIDAS SAML Message Format v1.2](https://github.com/litsec/eidas-opensaml/files/2219283/eIDAS.Message.Format_v1.2_final.docx)

* [eIDAS SAML Attribute Profile v1.2](https://github.com/litsec/eidas-opensaml/files/3236266/eIDAS.SAML.Attribute.Profile.v1.2-FINAL.pdf)

> **Note**: Support for OpenSAML 2.X has been discontinued. The last release of eidas-opensaml supporting OpenSAML 2.X is 1.0.6.

### How to use the use the eidas-opensaml library

The eidas-opensaml artifacts are published to Maven central and a dependency to the library should be included as follows in the application POM-file:

```
<dependency>
  <groupId>se.litsec.eidas</groupId>
  <artifactId>eidas-opensaml3</artifactId>
  <version>${eidas-opensaml.version}</version>
</dependency>
```

### Documentation

* API documentation - [https://litsec.github.io/eidas-opensaml/javadoc/opensaml3/1.4.0](https://litsec.github.io/eidas-opensaml/javadoc/opensaml3/1.4.0/index.html).
* Generated project documentation - [https://litsec.github.io/eidas-opensaml/site](https://litsec.github.io/eidas-opensaml/site/index.html).

### Examples

#### Creating an eIDAS AuthnRequest message

The [eIDAS SAML Message Format v1.2](https://github.com/litsec/eidas-opensaml/files/2219283/eIDAS.Message.Format_v1.2_final.docx) specification describes how a SAML `AuthnRequest` message should be put together to comply to the eIDAS specifications. 

[CreateAuthnRequestExample.java](https://github.com/litsec/eidas-opensaml/blob/master/opensaml3/src/test/java/se/litsec/eidas/opensaml/examples/CreateAuthnRequestExample.java) illustrates how you could create an authentication request message using the eidas-opensaml library.

#### Parsing an Assertion

An assertion issued from an eIDAS service will contain the attributes defined in [eIDAS SAML Attribute Profile](https://github.com/litsec/eidas-opensaml/files/3236266/eIDAS.SAML.Attribute.Profile.v1.2-FINAL.pdf).

[ParseAssertionExample.java](https://github.com/litsec/eidas-opensaml/blob/master/opensaml3/src/test/java/se/litsec/eidas/opensaml/examples/ParseAssertionExample.java) shows how to parse an Assertion and get hold of all attribute values.

### Contact and support

![Logo](https://litsec.github.io/eidas-opensaml/img/logo-small.png)

Contact [Litsec Labs](mailto:info@litsec.se) if you have any questions or suggestions ...

### Resources

##### eIDAS Specifications

* [eIDAS - Interoperability Architechture v1.2](https://github.com/litsec/eidas-opensaml/files/3236262/2019_05_23_eIDAS.Interoperability.Architecture.v1.2_Final2_CT.pdf)

* [ eIDAS - Cryptographic requirements for the Interoperability Framework v1.2](https://github.com/litsec/eidas-opensaml/files/3236260/2019_05_21_eIDAS.Crypto.Requirements_v1.2_Final2.pdf)

* [eIDAS SAML Message Format v1.2](https://github.com/litsec/eidas-opensaml/files/2219283/eIDAS.Message.Format_v1.2_final.docx)

* [eIDAS SAML Attribute Profile v1.2](https://github.com/litsec/eidas-opensaml/files/3236266/eIDAS.SAML.Attribute.Profile.v1.2-FINAL.pdf)

##### Swedish eID Framework

* [Technical specifications for the Swedish eID Framework](https://github.com/swedenconnect/technical-framework)
* [Sweden Connect](https://swedenconnect.se) - The portal for the Sweden Connect federation.
* [Sweden Connect - Sandbox](https://sandbox.swedenconnect.se/home/) - The portal for the Swedish eID and eIDAS test infrastructure.

##### OpenSAML and Shibboleth

* [OpenSAML v3 Confluence](https://wiki.shibboleth.net/confluence/display/OS30/Home)
* [OpenSAML v3 API documentation](https://build.shibboleth.net/nexus/content/sites/site/java-opensaml/3.4.3/apidocs/)
* [Shibboleth Identity Provider v3](https://wiki.shibboleth.net/confluence/display/IDP30) - *built using OpenSAML 3.x*


------

Copyright &copy; 2016-2019, [Litsec AB](http://www.litsec.se). Licensed under version 2.0 of the [Apache License](http://www.apache.org/licenses/LICENSE-2.0).

