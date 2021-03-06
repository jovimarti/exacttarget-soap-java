/*
 * XML Type:  RecurrenceTypeEnum
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML RecurrenceTypeEnum(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is an atomic type that is a restriction of com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum.
 */
public interface RecurrenceTypeEnum extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecurrenceTypeEnum.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("recurrencetypeenum9d0btype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum SECONDLY = Enum.forString("Secondly");
    static final Enum MINUTELY = Enum.forString("Minutely");
    static final Enum HOURLY = Enum.forString("Hourly");
    static final Enum DAILY = Enum.forString("Daily");
    static final Enum WEEKLY = Enum.forString("Weekly");
    static final Enum MONTHLY = Enum.forString("Monthly");
    static final Enum YEARLY = Enum.forString("Yearly");
    
    static final int INT_SECONDLY = Enum.INT_SECONDLY;
    static final int INT_MINUTELY = Enum.INT_MINUTELY;
    static final int INT_HOURLY = Enum.INT_HOURLY;
    static final int INT_DAILY = Enum.INT_DAILY;
    static final int INT_WEEKLY = Enum.INT_WEEKLY;
    static final int INT_MONTHLY = Enum.INT_MONTHLY;
    static final int INT_YEARLY = Enum.INT_YEARLY;
    
    /**
     * Enumeration value class for com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_SECONDLY
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
        
        static final int INT_SECONDLY = 1;
        static final int INT_MINUTELY = 2;
        static final int INT_HOURLY = 3;
        static final int INT_DAILY = 4;
        static final int INT_WEEKLY = 5;
        static final int INT_MONTHLY = 6;
        static final int INT_YEARLY = 7;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Secondly", INT_SECONDLY),
                new Enum("Minutely", INT_MINUTELY),
                new Enum("Hourly", INT_HOURLY),
                new Enum("Daily", INT_DAILY),
                new Enum("Weekly", INT_WEEKLY),
                new Enum("Monthly", INT_MONTHLY),
                new Enum("Yearly", INT_YEARLY),
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
        public static com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum newValue(java.lang.Object obj) {
          return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum) type.newValue( obj ); }
        
        public static com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum newInstance() {
          return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
