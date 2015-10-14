package com.Wsdl2Code.WebServices.ServiceProviderBinding;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 10/12/2015 6:33:32 PM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class HospitalXml implements KvmSerializable {
    
    public String contacts;
    public String id;
    public String info;
    public String location;
    public String name;
    
    public HospitalXml(){}
    
    public HospitalXml(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Contacts"))
        {
            Object obj = soapObject.getProperty("Contacts");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                contacts = j.toString();
            }else if (obj!= null && obj instanceof String){
                contacts = (String) obj;
            }
        }
        if (soapObject.hasProperty("Id"))
        {
            Object obj = soapObject.getProperty("Id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                id = j.toString();
            }else if (obj!= null && obj instanceof String){
                id = (String) obj;
            }
        }
        if (soapObject.hasProperty("Info"))
        {
            Object obj = soapObject.getProperty("Info");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                info = j.toString();
            }else if (obj!= null && obj instanceof String){
                info = (String) obj;
            }
        }
        if (soapObject.hasProperty("Location"))
        {
            Object obj = soapObject.getProperty("Location");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                location = j.toString();
            }else if (obj!= null && obj instanceof String){
                location = (String) obj;
            }
        }
        if (soapObject.hasProperty("Name"))
        {
            Object obj = soapObject.getProperty("Name");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                name = j.toString();
            }else if (obj!= null && obj instanceof String){
                name = (String) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return contacts;
            case 1:
                return id;
            case 2:
                return info;
            case 3:
                return location;
            case 4:
                return name;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 5;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Contacts";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Info";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Location";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Name";
                break;
        }
    }
    
    @Override
    public String getInnerText() {
        return null;
    }
    
    
    @Override
    public void setInnerText(String s) {
    }
    
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
