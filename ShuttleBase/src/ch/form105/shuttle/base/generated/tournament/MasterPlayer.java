/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: MasterPlayer.java,v 1.4 2006/06/16 19:35:25 luschtiger Exp $
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
 * Class MasterPlayer.
 * 
 * @version $Revision: 1.4 $ $Date: 2006/06/16 19:35:25 $
 */
public class MasterPlayer extends ch.form105.shuttle.base.Element 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _playerid
     */
    private java.lang.String _playerid;

    /**
     * Field _gameType
     */
    private ch.form105.shuttle.base.generated.tournament.GameType _gameType;

    /**
     * Field propertyChangeSupport
     */
    private java.beans.PropertyChangeSupport propertyChangeSupport;


      //----------------/
     //- Constructors -/
    //----------------/

    public MasterPlayer() 
     {
        super();
    } //-- ch.form105.shuttle.base.generated.tournament.MasterPlayer()


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
     * Returns the value of field 'gameType'.
     * 
     * @return GameType
     * @return the value of field 'gameType'.
     */
    public ch.form105.shuttle.base.generated.tournament.GameType getGameType()
    {
        return this._gameType;
    } //-- ch.form105.shuttle.base.generated.tournament.GameType getGameType() 

    /**
     * Returns the value of field 'playerid'.
     * 
     * @return String
     * @return the value of field 'playerid'.
     */
    public java.lang.String getPlayerid()
    {
        return this._playerid;
    } //-- java.lang.String getPlayerid() 

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
     * Sets the value of field 'gameType'.
     * 
     * @param gameType the value of field 'gameType'.
     */
    public void setGameType(ch.form105.shuttle.base.generated.tournament.GameType gameType)
    {
        java.lang.Object oldGameType = this._gameType;
        this._gameType = gameType;
        notifyPropertyChangeListeners("_gameType", oldGameType, this._gameType);
    } //-- void setGameType(ch.form105.shuttle.base.generated.tournament.GameType) 

    /**
     * Sets the value of field 'playerid'.
     * 
     * @param playerid the value of field 'playerid'.
     */
    public void setPlayerid(java.lang.String playerid)
    {
        java.lang.Object oldPlayerid = this._playerid;
        this._playerid = playerid;
        notifyPropertyChangeListeners("_playerid", oldPlayerid, this._playerid);
    } //-- void setPlayerid(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return MasterPlayer
     */
    public static ch.form105.shuttle.base.generated.tournament.MasterPlayer unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (ch.form105.shuttle.base.generated.tournament.MasterPlayer) Unmarshaller.unmarshal(ch.form105.shuttle.base.generated.tournament.MasterPlayer.class, reader);
    } //-- ch.form105.shuttle.base.generated.tournament.MasterPlayer unmarshal(java.io.Reader) 

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
