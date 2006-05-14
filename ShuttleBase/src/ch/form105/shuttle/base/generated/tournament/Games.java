/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Games.java,v 1.1 2006/05/14 10:28:16 luschtiger Exp $
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
 * Class Games.
 * 
 * @version $Revision: 1.1 $ $Date: 2006/05/14 10:28:16 $
 */
public class Games extends ch.form105.shuttle.base.Element 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _gameMenSingle
     */
    private ch.form105.shuttle.base.generated.tournament.GameMenSingle _gameMenSingle;

    /**
     * Field _gameWomenSingle
     */
    private ch.form105.shuttle.base.generated.tournament.GameWomenSingle _gameWomenSingle;

    /**
     * Field _gameMenDouble
     */
    private ch.form105.shuttle.base.generated.tournament.GameMenDouble _gameMenDouble;

    /**
     * Field _gameWomenDouble
     */
    private ch.form105.shuttle.base.generated.tournament.GameWomenDouble _gameWomenDouble;

    /**
     * Field _gameMixed
     */
    private ch.form105.shuttle.base.generated.tournament.GameMixed _gameMixed;

    /**
     * Field propertyChangeSupport
     */
    private java.beans.PropertyChangeSupport propertyChangeSupport;


      //----------------/
     //- Constructors -/
    //----------------/

    public Games() 
     {
        super();
    } //-- ch.form105.shuttle.base.generated.tournament.Games()


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
     * Returns the value of field 'gameMenDouble'.
     * 
     * @return GameMenDouble
     * @return the value of field 'gameMenDouble'.
     */
    public ch.form105.shuttle.base.generated.tournament.GameMenDouble getGameMenDouble()
    {
        return this._gameMenDouble;
    } //-- ch.form105.shuttle.base.generated.tournament.GameMenDouble getGameMenDouble() 

    /**
     * Returns the value of field 'gameMenSingle'.
     * 
     * @return GameMenSingle
     * @return the value of field 'gameMenSingle'.
     */
    public ch.form105.shuttle.base.generated.tournament.GameMenSingle getGameMenSingle()
    {
        return this._gameMenSingle;
    } //-- ch.form105.shuttle.base.generated.tournament.GameMenSingle getGameMenSingle() 

    /**
     * Returns the value of field 'gameMixed'.
     * 
     * @return GameMixed
     * @return the value of field 'gameMixed'.
     */
    public ch.form105.shuttle.base.generated.tournament.GameMixed getGameMixed()
    {
        return this._gameMixed;
    } //-- ch.form105.shuttle.base.generated.tournament.GameMixed getGameMixed() 

    /**
     * Returns the value of field 'gameWomenDouble'.
     * 
     * @return GameWomenDouble
     * @return the value of field 'gameWomenDouble'.
     */
    public ch.form105.shuttle.base.generated.tournament.GameWomenDouble getGameWomenDouble()
    {
        return this._gameWomenDouble;
    } //-- ch.form105.shuttle.base.generated.tournament.GameWomenDouble getGameWomenDouble() 

    /**
     * Returns the value of field 'gameWomenSingle'.
     * 
     * @return GameWomenSingle
     * @return the value of field 'gameWomenSingle'.
     */
    public ch.form105.shuttle.base.generated.tournament.GameWomenSingle getGameWomenSingle()
    {
        return this._gameWomenSingle;
    } //-- ch.form105.shuttle.base.generated.tournament.GameWomenSingle getGameWomenSingle() 

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
     * Sets the value of field 'gameMenDouble'.
     * 
     * @param gameMenDouble the value of field 'gameMenDouble'.
     */
    public void setGameMenDouble(ch.form105.shuttle.base.generated.tournament.GameMenDouble gameMenDouble)
    {
        java.lang.Object oldGameMenDouble = this._gameMenDouble;
        this._gameMenDouble = gameMenDouble;
        notifyPropertyChangeListeners("_gameMenDouble", oldGameMenDouble, this._gameMenDouble);
    } //-- void setGameMenDouble(ch.form105.shuttle.base.generated.tournament.GameMenDouble) 

    /**
     * Sets the value of field 'gameMenSingle'.
     * 
     * @param gameMenSingle the value of field 'gameMenSingle'.
     */
    public void setGameMenSingle(ch.form105.shuttle.base.generated.tournament.GameMenSingle gameMenSingle)
    {
        java.lang.Object oldGameMenSingle = this._gameMenSingle;
        this._gameMenSingle = gameMenSingle;
        notifyPropertyChangeListeners("_gameMenSingle", oldGameMenSingle, this._gameMenSingle);
    } //-- void setGameMenSingle(ch.form105.shuttle.base.generated.tournament.GameMenSingle) 

    /**
     * Sets the value of field 'gameMixed'.
     * 
     * @param gameMixed the value of field 'gameMixed'.
     */
    public void setGameMixed(ch.form105.shuttle.base.generated.tournament.GameMixed gameMixed)
    {
        java.lang.Object oldGameMixed = this._gameMixed;
        this._gameMixed = gameMixed;
        notifyPropertyChangeListeners("_gameMixed", oldGameMixed, this._gameMixed);
    } //-- void setGameMixed(ch.form105.shuttle.base.generated.tournament.GameMixed) 

    /**
     * Sets the value of field 'gameWomenDouble'.
     * 
     * @param gameWomenDouble the value of field 'gameWomenDouble'.
     */
    public void setGameWomenDouble(ch.form105.shuttle.base.generated.tournament.GameWomenDouble gameWomenDouble)
    {
        java.lang.Object oldGameWomenDouble = this._gameWomenDouble;
        this._gameWomenDouble = gameWomenDouble;
        notifyPropertyChangeListeners("_gameWomenDouble", oldGameWomenDouble, this._gameWomenDouble);
    } //-- void setGameWomenDouble(ch.form105.shuttle.base.generated.tournament.GameWomenDouble) 

    /**
     * Sets the value of field 'gameWomenSingle'.
     * 
     * @param gameWomenSingle the value of field 'gameWomenSingle'.
     */
    public void setGameWomenSingle(ch.form105.shuttle.base.generated.tournament.GameWomenSingle gameWomenSingle)
    {
        java.lang.Object oldGameWomenSingle = this._gameWomenSingle;
        this._gameWomenSingle = gameWomenSingle;
        notifyPropertyChangeListeners("_gameWomenSingle", oldGameWomenSingle, this._gameWomenSingle);
    } //-- void setGameWomenSingle(ch.form105.shuttle.base.generated.tournament.GameWomenSingle) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Games
     */
    public static ch.form105.shuttle.base.generated.tournament.Games unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (ch.form105.shuttle.base.generated.tournament.Games) Unmarshaller.unmarshal(ch.form105.shuttle.base.generated.tournament.Games.class, reader);
    } //-- ch.form105.shuttle.base.generated.tournament.Games unmarshal(java.io.Reader) 

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
