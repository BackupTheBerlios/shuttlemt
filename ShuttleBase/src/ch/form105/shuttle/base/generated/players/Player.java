/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Player.java,v 1.2 2006/05/14 10:27:47 luschtiger Exp $
 */

package ch.form105.shuttle.base.generated.players;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import ch.form105.shuttle.base.generated.players.types.SexType;
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
 * Class Player.
 * 
 * @version $Revision: 1.2 $ $Date: 2006/05/14 10:27:47 $
 */
public class Player extends ch.form105.shuttle.base.Element 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _id
     */
    private java.lang.String _id;

    /**
     * Field _sirname
     */
    private java.lang.String _sirname;

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _sex
     */
    private ch.form105.shuttle.base.generated.players.types.SexType _sex;

    /**
     * Field _clubnr
     */
    private int _clubnr;

    /**
     * keeps track of state for field: _clubnr
     */
    private boolean _has_clubnr;

    /**
     * Field _birthday
     */
    private java.lang.String _birthday;

    /**
     * Field _classifier
     */
    private ch.form105.shuttle.base.generated.players.Classifier _classifier;

    /**
     * Field propertyChangeSupport
     */
    private java.beans.PropertyChangeSupport propertyChangeSupport;


      //----------------/
     //- Constructors -/
    //----------------/

    public Player() 
     {
        super();
    } //-- ch.form105.shuttle.base.generated.players.Player()


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
     * Method deleteClubnr
     * 
     */
    public void deleteClubnr()
    {
        this._has_clubnr= false;
        notifyPropertyChangeListeners("_clubnr", new java.lang.Integer(this._clubnr), null);
    } //-- void deleteClubnr() 

    /**
     * Returns the value of field 'birthday'.
     * 
     * @return String
     * @return the value of field 'birthday'.
     */
    public java.lang.String getBirthday()
    {
        return this._birthday;
    } //-- java.lang.String getBirthday() 

    /**
     * Returns the value of field 'classifier'.
     * 
     * @return Classifier
     * @return the value of field 'classifier'.
     */
    public ch.form105.shuttle.base.generated.players.Classifier getClassifier()
    {
        return this._classifier;
    } //-- ch.form105.shuttle.base.generated.players.Classifier getClassifier() 

    /**
     * Returns the value of field 'clubnr'.
     * 
     * @return int
     * @return the value of field 'clubnr'.
     */
    public int getClubnr()
    {
        return this._clubnr;
    } //-- int getClubnr() 

    /**
     * Returns the value of field 'id'.
     * 
     * @return String
     * @return the value of field 'id'.
     */
    public java.lang.String getId()
    {
        return this._id;
    } //-- java.lang.String getId() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return String
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'sex'.
     * 
     * @return SexType
     * @return the value of field 'sex'.
     */
    public ch.form105.shuttle.base.generated.players.types.SexType getSex()
    {
        return this._sex;
    } //-- ch.form105.shuttle.base.generated.players.types.SexType getSex() 

    /**
     * Returns the value of field 'sirname'.
     * 
     * @return String
     * @return the value of field 'sirname'.
     */
    public java.lang.String getSirname()
    {
        return this._sirname;
    } //-- java.lang.String getSirname() 

    /**
     * Method hasClubnr
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasClubnr()
    {
        return this._has_clubnr;
    } //-- boolean hasClubnr() 

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
     * Sets the value of field 'birthday'.
     * 
     * @param birthday the value of field 'birthday'.
     */
    public void setBirthday(java.lang.String birthday)
    {
        java.lang.Object oldBirthday = this._birthday;
        this._birthday = birthday;
        notifyPropertyChangeListeners("_birthday", oldBirthday, this._birthday);
    } //-- void setBirthday(java.lang.String) 

    /**
     * Sets the value of field 'classifier'.
     * 
     * @param classifier the value of field 'classifier'.
     */
    public void setClassifier(ch.form105.shuttle.base.generated.players.Classifier classifier)
    {
        java.lang.Object oldClassifier = this._classifier;
        this._classifier = classifier;
        notifyPropertyChangeListeners("_classifier", oldClassifier, this._classifier);
    } //-- void setClassifier(ch.form105.shuttle.base.generated.players.Classifier) 

    /**
     * Sets the value of field 'clubnr'.
     * 
     * @param clubnr the value of field 'clubnr'.
     */
    public void setClubnr(int clubnr)
    {
        java.lang.Object oldClubnr = new java.lang.Integer(this._clubnr);
        this._clubnr = clubnr;
        this._has_clubnr = true;
        notifyPropertyChangeListeners("_clubnr", oldClubnr, new java.lang.Integer(this._clubnr));
    } //-- void setClubnr(int) 

    /**
     * Sets the value of field 'id'.
     * 
     * @param id the value of field 'id'.
     */
    public void setId(java.lang.String id)
    {
        java.lang.Object oldId = this._id;
        this._id = id;
        notifyPropertyChangeListeners("_id", oldId, this._id);
    } //-- void setId(java.lang.String) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        java.lang.Object oldName = this._name;
        this._name = name;
        notifyPropertyChangeListeners("_name", oldName, this._name);
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'sex'.
     * 
     * @param sex the value of field 'sex'.
     */
    public void setSex(ch.form105.shuttle.base.generated.players.types.SexType sex)
    {
        java.lang.Object oldSex = this._sex;
        this._sex = sex;
        notifyPropertyChangeListeners("_sex", oldSex, this._sex);
    } //-- void setSex(ch.form105.shuttle.base.generated.players.types.SexType) 

    /**
     * Sets the value of field 'sirname'.
     * 
     * @param sirname the value of field 'sirname'.
     */
    public void setSirname(java.lang.String sirname)
    {
        java.lang.Object oldSirname = this._sirname;
        this._sirname = sirname;
        notifyPropertyChangeListeners("_sirname", oldSirname, this._sirname);
    } //-- void setSirname(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Player
     */
    public static ch.form105.shuttle.base.generated.players.Player unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (ch.form105.shuttle.base.generated.players.Player) Unmarshaller.unmarshal(ch.form105.shuttle.base.generated.players.Player.class, reader);
    } //-- ch.form105.shuttle.base.generated.players.Player unmarshal(java.io.Reader) 

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
