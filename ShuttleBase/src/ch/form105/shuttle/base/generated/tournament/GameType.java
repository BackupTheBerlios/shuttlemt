/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: GameType.java,v 1.1 2006/05/14 10:28:16 luschtiger Exp $
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
 * Class GameType.
 * 
 * @version $Revision: 1.1 $ $Date: 2006/05/14 10:28:16 $
 */
public class GameType extends ch.form105.shuttle.base.Element 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _womenSingle
     */
    private ch.form105.shuttle.base.generated.tournament.WomenSingle _womenSingle;

    /**
     * Field _menSingle
     */
    private ch.form105.shuttle.base.generated.tournament.MenSingle _menSingle;

    /**
     * Field _womenDouble
     */
    private ch.form105.shuttle.base.generated.tournament.WomenDouble _womenDouble;

    /**
     * Field _menDouble
     */
    private ch.form105.shuttle.base.generated.tournament.MenDouble _menDouble;

    /**
     * Field _mixed
     */
    private ch.form105.shuttle.base.generated.tournament.Mixed _mixed;

    /**
     * Field propertyChangeSupport
     */
    private java.beans.PropertyChangeSupport propertyChangeSupport;


      //----------------/
     //- Constructors -/
    //----------------/

    public GameType() 
     {
        super();
    } //-- ch.form105.shuttle.base.generated.tournament.GameType()


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
     * Returns the value of field 'menDouble'.
     * 
     * @return MenDouble
     * @return the value of field 'menDouble'.
     */
    public ch.form105.shuttle.base.generated.tournament.MenDouble getMenDouble()
    {
        return this._menDouble;
    } //-- ch.form105.shuttle.base.generated.tournament.MenDouble getMenDouble() 

    /**
     * Returns the value of field 'menSingle'.
     * 
     * @return MenSingle
     * @return the value of field 'menSingle'.
     */
    public ch.form105.shuttle.base.generated.tournament.MenSingle getMenSingle()
    {
        return this._menSingle;
    } //-- ch.form105.shuttle.base.generated.tournament.MenSingle getMenSingle() 

    /**
     * Returns the value of field 'mixed'.
     * 
     * @return Mixed
     * @return the value of field 'mixed'.
     */
    public ch.form105.shuttle.base.generated.tournament.Mixed getMixed()
    {
        return this._mixed;
    } //-- ch.form105.shuttle.base.generated.tournament.Mixed getMixed() 

    /**
     * Returns the value of field 'womenDouble'.
     * 
     * @return WomenDouble
     * @return the value of field 'womenDouble'.
     */
    public ch.form105.shuttle.base.generated.tournament.WomenDouble getWomenDouble()
    {
        return this._womenDouble;
    } //-- ch.form105.shuttle.base.generated.tournament.WomenDouble getWomenDouble() 

    /**
     * Returns the value of field 'womenSingle'.
     * 
     * @return WomenSingle
     * @return the value of field 'womenSingle'.
     */
    public ch.form105.shuttle.base.generated.tournament.WomenSingle getWomenSingle()
    {
        return this._womenSingle;
    } //-- ch.form105.shuttle.base.generated.tournament.WomenSingle getWomenSingle() 

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
     * Sets the value of field 'menDouble'.
     * 
     * @param menDouble the value of field 'menDouble'.
     */
    public void setMenDouble(ch.form105.shuttle.base.generated.tournament.MenDouble menDouble)
    {
        java.lang.Object oldMenDouble = this._menDouble;
        this._menDouble = menDouble;
        notifyPropertyChangeListeners("_menDouble", oldMenDouble, this._menDouble);
    } //-- void setMenDouble(ch.form105.shuttle.base.generated.tournament.MenDouble) 

    /**
     * Sets the value of field 'menSingle'.
     * 
     * @param menSingle the value of field 'menSingle'.
     */
    public void setMenSingle(ch.form105.shuttle.base.generated.tournament.MenSingle menSingle)
    {
        java.lang.Object oldMenSingle = this._menSingle;
        this._menSingle = menSingle;
        notifyPropertyChangeListeners("_menSingle", oldMenSingle, this._menSingle);
    } //-- void setMenSingle(ch.form105.shuttle.base.generated.tournament.MenSingle) 

    /**
     * Sets the value of field 'mixed'.
     * 
     * @param mixed the value of field 'mixed'.
     */
    public void setMixed(ch.form105.shuttle.base.generated.tournament.Mixed mixed)
    {
        java.lang.Object oldMixed = this._mixed;
        this._mixed = mixed;
        notifyPropertyChangeListeners("_mixed", oldMixed, this._mixed);
    } //-- void setMixed(ch.form105.shuttle.base.generated.tournament.Mixed) 

    /**
     * Sets the value of field 'womenDouble'.
     * 
     * @param womenDouble the value of field 'womenDouble'.
     */
    public void setWomenDouble(ch.form105.shuttle.base.generated.tournament.WomenDouble womenDouble)
    {
        java.lang.Object oldWomenDouble = this._womenDouble;
        this._womenDouble = womenDouble;
        notifyPropertyChangeListeners("_womenDouble", oldWomenDouble, this._womenDouble);
    } //-- void setWomenDouble(ch.form105.shuttle.base.generated.tournament.WomenDouble) 

    /**
     * Sets the value of field 'womenSingle'.
     * 
     * @param womenSingle the value of field 'womenSingle'.
     */
    public void setWomenSingle(ch.form105.shuttle.base.generated.tournament.WomenSingle womenSingle)
    {
        java.lang.Object oldWomenSingle = this._womenSingle;
        this._womenSingle = womenSingle;
        notifyPropertyChangeListeners("_womenSingle", oldWomenSingle, this._womenSingle);
    } //-- void setWomenSingle(ch.form105.shuttle.base.generated.tournament.WomenSingle) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return GameType
     */
    public static ch.form105.shuttle.base.generated.tournament.GameType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (ch.form105.shuttle.base.generated.tournament.GameType) Unmarshaller.unmarshal(ch.form105.shuttle.base.generated.tournament.GameType.class, reader);
    } //-- ch.form105.shuttle.base.generated.tournament.GameType unmarshal(java.io.Reader) 

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
