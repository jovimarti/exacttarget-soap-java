/*
 * XML Type:  LayoutType
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.LayoutType
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML LayoutType(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is an atomic type that is a restriction of com.exacttarget.wsdl.partnerapi.LayoutType.
 */
public interface LayoutType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LayoutType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("layouttypef312type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum HTML_WRAPPED = Enum.forString("HTMLWrapped");
    static final Enum RAW_TEXT = Enum.forString("RawText");
    static final Enum SMS = Enum.forString("SMS");
    
    static final int INT_HTML_WRAPPED = Enum.INT_HTML_WRAPPED;
    static final int INT_RAW_TEXT = Enum.INT_RAW_TEXT;
    static final int INT_SMS = Enum.INT_SMS;
    
    /**
     * Enumeration value class for com.exacttarget.wsdl.partnerapi.LayoutType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_HTML_WRAPPED
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_HTML_WRAPPED = 1;
        static final int INT_RAW_TEXT = 2;
        static final int INT_SMS = 3;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("HTMLWrapped", INT_HTML_WRAPPED),
                new Enum("RawText", INT_RAW_TEXT),
                new Enum("SMS", INT_SMS),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.LayoutType newValue(java.lang.Object obj) {
          return (com.exacttarget.wsdl.partnerapi.LayoutType) type.newValue( obj ); }
        
        public static com.exacttarget.wsdl.partnerapi.LayoutType newInstance() {
          return (com.exacttarget.wsdl.partnerapi.LayoutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.LayoutType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.LayoutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.LayoutType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.LayoutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.LayoutType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.LayoutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.LayoutType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.LayoutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.LayoutType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.LayoutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.LayoutType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.LayoutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.LayoutType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.LayoutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.LayoutType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.LayoutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.LayoutType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.LayoutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.LayoutType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.LayoutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.LayoutType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.LayoutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.LayoutType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.LayoutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.LayoutType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.LayoutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.LayoutType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.LayoutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.LayoutType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.LayoutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.LayoutType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.LayoutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.LayoutType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.LayoutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
