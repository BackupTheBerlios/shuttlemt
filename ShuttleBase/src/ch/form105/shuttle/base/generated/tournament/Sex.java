/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Sex.java,v 1.1 2006/05/12 17:37:12 luschtiger Exp $
 */

package ch.form105.shuttle.base.generated.tournament;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Sex.
 * 
 * @version $Revision: 1.1 $ $Date: 2006/05/12 17:37:12 $
 */
public class Sex extends ch.form105.shuttle.base.Element 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Internal choice value storage
     */
    private java.lang.Object _choiceValue;

    /**
     * Field _male
     */
    private java.lang.Object _male;

    /**
     * Field _female
     */
    private java.lang.Object _female;

    /**
     * Field propertyChangeSupport
     */
    private java.beans.PropertyChangeSupport propertyChangeSupport;


      //----------------/
     //- Constructors -/
    //----------------/

    public Sex() 
     {
        super();
    } //-- ch.form105.shuttle.base.generated.tournament.Sex()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPropertyChangeListener
     * 
     * Registers a PropertyChangeListener with this class.
     * 
     * @param pcl The PropertyChangeListener to register.
     */
    public void addPropertyChangeListener(java.beans.PropertyChangeListener pcl)
    {
        if (propertyChangeSupport == null) {
            propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
        }
        propertyChangeSupport.addPropertyChangeListener(pcl);
    } //-- void addPropertyChangeListener(java.beans.PropertyChangeListener) 

    /**
     * Returns the value of field 'choiceValue'. The field
     * 'choiceValue' has the following description: Internal choice
     * value storage
     * 
     * @return Object
     * @return the value of field 'choiceValue'.
     */
    public java.lang.Object getChoiceValue()
    {
        return this._choiceValue;
    } //-- java.lang.Object getChoiceValue() 

    /**
     * Returns the value of field 'female'.
     * 
     * @return Object
     * @return the value of field 'female'.
     */
    public java.lang.Object getFemale()
    {
        return this._female;
    } //-- java.lang.Object getFemale() 

    /**
     * Returns the value of field 'male'.
     * 
     * @return Object
     * @return the value of field 'male'.
     */
    public java.lang.Object getMale()
    {
        return this._male;
    } //-- java.lang.Object getMale() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method notifyPropertyChangeListeners
     * 
     * Notifies all registered PropertyChangeListeners when a bound
     * property's value changes.
     * 
     * @param fieldName the name of the property that has changed.
     * @param newValue the new value of the property.
     * @param oldValue the old value of the property.
     */
    protected void notifyPropertyChangeListeners(java.lang.String fieldName, java.lang.Object oldValue, java.lang.Object newValue)
    {
        if (propertyChangeSupport == null) return;
        propertyChangeSupport.firePropertyChange(fieldName,oldValue,newValue);
    } //-- void notifyPropertyChangeListeners(java.lang.String, java.lang.Object, java.lang.Object) 

    /**
     * Method removePropertyChangeListener
     * 
     * Removes the given PropertyChangeListener from this classes
     * list of ProperyChangeListeners.
     * 
     * @param pcl The PropertyChangeListener to remove.
     * @return boolean
     */
    public boolean removePropertyChangeListener(java.beans.PropertyChangeListener pcl)
    {
        if (propertyChangeSupport == null) return false;
        propertyChangeSupport.removePropertyChangeListener(pcl);
        return true;
    } //-- boolean removePropertyChangeListener(java.beans.PropertyChangeListener) 

    /**
     * Sets the value of field 'female'.
     * 
     * @param female the value of field 'female'.
     */
    public void setFemale(java.lang.Object female)
    {
        java.lang.Object oldFemale = this._female;
        this._female = female;
        this._choiceValue = female;
        notifyPropertyChangeListeners("_female", oldFemale, this._female);
    } //-- void setFemale(java.lang.Object) 

    /**
     * Sets the value of field 'male'.
     * 
     * @param male the value of field 'male'.
     */
    public void setMale(java.lang.Object male)
    {
        java.lang.Object oldMale = this._male;
        this._male = male;
        this._choiceValue = male;
        notifyPropertyChangeListeners("_male", oldMale, this._male);
    } //-- void setMale(java.lang.Object) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Sex
     */
    public static ch.form105.shuttle.base.generated.tournament.Sex unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (ch.form105.shuttle.base.generated.tournament.Sex) Unmarshaller.unmarshal(ch.form105.shuttle.base.generated.tournament.Sex.class, reader);
    } //-- ch.form105.shuttle.base.generated.tournament.Sex unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
