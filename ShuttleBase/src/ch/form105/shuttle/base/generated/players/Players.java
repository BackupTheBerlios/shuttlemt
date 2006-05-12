/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Players.java,v 1.1 2006/05/12 17:37:12 luschtiger Exp $
 */

package ch.form105.shuttle.base.generated.players;

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
import java.util.ArrayList;
import java.util.Enumeration;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Players.
 * 
 * @version $Revision: 1.1 $ $Date: 2006/05/12 17:37:12 $
 */
public class Players extends ch.form105.shuttle.base.Element 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _playerList
     */
    private java.util.ArrayList _playerList;

    /**
     * Field propertyChangeSupport
     */
    private java.beans.PropertyChangeSupport propertyChangeSupport;


      //----------------/
     //- Constructors -/
    //----------------/

    public Players() 
     {
        super();
        _playerList = new ArrayList();
    } //-- ch.form105.shuttle.base.generated.players.Players()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPlayer
     * 
     * 
     * 
     * @param vPlayer
     */
    public void addPlayer(ch.form105.shuttle.base.generated.players.Player vPlayer)
        throws java.lang.IndexOutOfBoundsException
    {
        _playerList.add(vPlayer);
        notifyPropertyChangeListeners("_playerList", null, _playerList);
    } //-- void addPlayer(ch.form105.shuttle.base.generated.players.Player) 

    /**
     * Method addPlayer
     * 
     * 
     * 
     * @param index
     * @param vPlayer
     */
    public void addPlayer(int index, ch.form105.shuttle.base.generated.players.Player vPlayer)
        throws java.lang.IndexOutOfBoundsException
    {
        _playerList.add(index, vPlayer);
        notifyPropertyChangeListeners("_playerList", null, _playerList);
    } //-- void addPlayer(int, ch.form105.shuttle.base.generated.players.Player) 

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
     * Method clearPlayer
     * 
     */
    public void clearPlayer()
    {
        _playerList.clear();
        notifyPropertyChangeListeners("_playerList", null, _playerList);
    } //-- void clearPlayer() 

    /**
     * Method enumeratePlayer
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumeratePlayer()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_playerList.iterator());
    } //-- java.util.Enumeration enumeratePlayer() 

    /**
     * Method getPlayer
     * 
     * 
     * 
     * @param index
     * @return Player
     */
    public ch.form105.shuttle.base.generated.players.Player getPlayer(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _playerList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (ch.form105.shuttle.base.generated.players.Player) _playerList.get(index);
    } //-- ch.form105.shuttle.base.generated.players.Player getPlayer(int) 

    /**
     * Method getPlayer
     * 
     * 
     * 
     * @return Player
     */
    public ch.form105.shuttle.base.generated.players.Player[] getPlayer()
    {
        int size = _playerList.size();
        ch.form105.shuttle.base.generated.players.Player[] mArray = new ch.form105.shuttle.base.generated.players.Player[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (ch.form105.shuttle.base.generated.players.Player) _playerList.get(index);
        }
        return mArray;
    } //-- ch.form105.shuttle.base.generated.players.Player[] getPlayer() 

    /**
     * Method getPlayerCount
     * 
     * 
     * 
     * @return int
     */
    public int getPlayerCount()
    {
        return _playerList.size();
    } //-- int getPlayerCount() 

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
     * Method removePlayer
     * 
     * 
     * 
     * @param vPlayer
     * @return boolean
     */
    public boolean removePlayer(ch.form105.shuttle.base.generated.players.Player vPlayer)
    {
        boolean removed = _playerList.remove(vPlayer);
        notifyPropertyChangeListeners("_playerList", null, _playerList);
        return removed;
    } //-- boolean removePlayer(ch.form105.shuttle.base.generated.players.Player) 

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
     * Method setPlayer
     * 
     * 
     * 
     * @param index
     * @param vPlayer
     */
    public void setPlayer(int index, ch.form105.shuttle.base.generated.players.Player vPlayer)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _playerList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _playerList.set(index, vPlayer);
        notifyPropertyChangeListeners("_playerList", null, _playerList);
    } //-- void setPlayer(int, ch.form105.shuttle.base.generated.players.Player) 

    /**
     * Method setPlayer
     * 
     * 
     * 
     * @param playerArray
     */
    public void setPlayer(ch.form105.shuttle.base.generated.players.Player[] playerArray)
    {
        //-- copy array
        _playerList.clear();
        for (int i = 0; i < playerArray.length; i++) {
            _playerList.add(playerArray[i]);
        }
        notifyPropertyChangeListeners("_playerList", null, _playerList);
    } //-- void setPlayer(ch.form105.shuttle.base.generated.players.Player) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Players
     */
    public static ch.form105.shuttle.base.generated.players.Players unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (ch.form105.shuttle.base.generated.players.Players) Unmarshaller.unmarshal(ch.form105.shuttle.base.generated.players.Players.class, reader);
    } //-- ch.form105.shuttle.base.generated.players.Players unmarshal(java.io.Reader) 

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
