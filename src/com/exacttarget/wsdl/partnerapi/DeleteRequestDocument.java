/*
 * An XML document type.
 * Localname: DeleteRequest
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.DeleteRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * A document containing one DeleteRequest(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public interface DeleteRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeleteRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("deleterequestbbb4doctype");
    
    /**
     * Gets the "DeleteRequest" element
     */
    com.exacttarget.wsdl.partnerapi.DeleteRequestDocument.DeleteRequest getDeleteRequest();
    
    /**
     * Sets the "DeleteRequest" element
     */
    void setDeleteRequest(com.exacttarget.wsdl.partnerapi.DeleteRequestDocument.DeleteRequest deleteRequest);
    
    /**
     * Appends and returns a new empty "DeleteRequest" element
     */
    com.exacttarget.wsdl.partnerapi.DeleteRequestDocument.DeleteRequest addNewDeleteRequest();
    
    /**
     * An XML DeleteRequest(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface DeleteRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeleteRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("deleterequestf904elemtype");
        
        /**
         * Gets the "Options" element
         */
        com.exacttarget.wsdl.partnerapi.DeleteOptions getOptions();
        
        /**
         * Sets the "Options" element
         */
        void setOptions(com.exacttarget.wsdl.partnerapi.DeleteOptions options);
        
        /**
         * Appends and returns a new empty "Options" element
         */
        com.exacttarget.wsdl.partnerapi.DeleteOptions addNewOptions();
        
        /**
         * Gets array of all "Objects" elements
         */
        com.exacttarget.wsdl.partnerapi.APIObject[] getObjectsArray();
        
        /**
         * Gets ith "Objects" element
         */
        com.exacttarget.wsdl.partnerapi.APIObject getObjectsArray(int i);
        
        /**
         * Returns number of "Objects" element
         */
        int sizeOfObjectsArray();
        
        /**
         * Sets array of all "Objects" element
         */
        void setObjectsArray(com.exacttarget.wsdl.partnerapi.APIObject[] objectsArray);
        
        /**
         * Sets ith "Objects" element
         */
        void setObjectsArray(int i, com.exacttarget.wsdl.partnerapi.APIObject objects);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Objects" element
         */
        com.exacttarget.wsdl.partnerapi.APIObject insertNewObjects(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Objects" element
         */
        com.exacttarget.wsdl.partnerapi.APIObject addNewObjects();
        
        /**
         * Removes the ith "Objects" element
         */
        void removeObjects(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument.DeleteRequest newInstance() {
              return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument.DeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument.DeleteRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument.DeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument newInstance() {
          return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.DeleteRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.DeleteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}