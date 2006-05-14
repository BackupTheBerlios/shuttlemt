/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: GameMixed.java,v 1.1 2006/05/14 10:28:16 luschtiger Exp $
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
 * Class GameMixed.
 * 
 * @version $Revision: 1.1 $ $Date: 2006/05/14 10:28:16 $
 */
public class GameMixed extends ch.form105.shuttle.base.Element 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _maxPoints
     */
    private int _maxPoints = 21;

    /**
     * keeps track of state for field: _maxPoints
     */
    private boolean _has_maxPoints;

    /**
     * Field _isActive
     */
    private boolean _isActive;

    /**
     * keeps track of state for field: _isActive
     */
    private boolean _has_isActive;

    /**
     * Field propertyChangeSupport
     */
    private java.beans.PropertyChangeSupport propertyChangeSupport;


      //----------------/
     //- Constructors -/
    //----------------/

    public GameMixed() 
     {
        super();
    } //-- ch.form105.shuttle.base.generated.tournament.GameMixed()


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
     * Method deleteIsActive
     * 
     */
    public void deleteIsActive()
    {
        this._has_isActive= false;
        notifyPropertyChangeListeners("_isActive", (this._isActive ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE), null);
    } //-- void deleteIsActive() 

    /**
     * Method deleteMaxPoints
     * 
     */
    public void deleteMaxPoints()
    {
        this._has_maxPoints= false;
        notifyPropertyChangeListeners("_maxPoints", new java.lang.Integer(this._maxPoints), null);
    } //-- void deleteMaxPoints() 

    /**
     * Returns the value of field 'isActive'.
     * 
     * @return boolean
     * @return the value of field 'isActive'.
     */
    public boolean getIsActive()
    {
        return this._isActive;
    } //-- boolean getIsActive() 

    /**
     * Returns the value of field 'maxPoints'.
     * 
     * @return int
     * @return the value of field 'maxPoints'.
     */
    public int getMaxPoints()
    {
        return this._maxPoints;
    } //-- int getMaxPoints() 

    /**
     * Method hasIsActive
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasIsActive()
    {
        return this._has_isActive;
    } //-- boolean hasIsActive() 

    /**
     * Method hasMaxPoints
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMaxPoints()
    {
        return this._has_maxPoints;
    } //-- boolean hasMaxPoints() 

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
     * Sets the value of field 'isActive'.
     * 
     * @param isActive the value of field 'isActive'.
     */
    public void setIsActive(boolean isActive)
    {
        java.lang.Object oldIsActive = (this._isActive ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE);
        this._isActive = isActive;
        this._has_isActive = true;
        notifyPropertyChangeListeners("_isActive", oldIsActive, (this._isActive ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
    } //-- void setIsActive(boolean) 

    /**
     * Sets the value of field 'maxPoints'.
     * 
     * @param maxPoints the value of field 'maxPoints'.
     */
    public void setMaxPoints(int maxPoints)
    {
        java.lang.Object oldMaxPoints = new java.lang.Integer(this._maxPoints);
        this._maxPoints = maxPoints;
        this._has_maxPoints = true;
        notifyPropertyChangeListeners("_maxPoints", oldMaxPoints, new java.lang.Integer(this._maxPoints));
    } //-- void setMaxPoints(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return GameMixed
     */
    public static ch.form105.shuttle.base.generated.tournament.GameMixed unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (ch.form105.shuttle.base.generated.tournament.GameMixed) Unmarshaller.unmarshal(ch.form105.shuttle.base.generated.tournament.GameMixed.class, reader);
    } //-- ch.form105.shuttle.base.generated.tournament.GameMixed unmarshal(java.io.Reader) 

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
