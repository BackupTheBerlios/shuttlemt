/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Tournament.java,v 1.2 2006/05/14 10:27:30 luschtiger Exp $
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
import java.util.ArrayList;
import java.util.Enumeration;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Tournament.
 * 
 * @version $Revision: 1.2 $ $Date: 2006/05/14 10:27:30 $
 */
public class Tournament extends ch.form105.shuttle.base.Element 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _tournamentName
     */
    private java.lang.String _tournamentName;

    /**
     * Field _masterPlayerList
     */
    private java.util.ArrayList _masterPlayerList;

    /**
     * Field _games
     */
    private ch.form105.shuttle.base.generated.tournament.Games _games;

    /**
     * Field propertyChangeSupport
     */
    private java.beans.PropertyChangeSupport propertyChangeSupport;


      //----------------/
     //- Constructors -/
    //----------------/

    public Tournament() 
     {
        super();
        _masterPlayerList = new ArrayList();
    } //-- ch.form105.shuttle.base.generated.tournament.Tournament()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addMasterPlayer
     * 
     * 
     * 
     * @param vMasterPlayer
     */
    public void addMasterPlayer(java.lang.Object vMasterPlayer)
        throws java.lang.IndexOutOfBoundsException
    {
        _masterPlayerList.add(vMasterPlayer);
        notifyPropertyChangeListeners("_masterPlayerList", null, _masterPlayerList);
    } //-- void addMasterPlayer(java.lang.Object) 

    /**
     * Method addMasterPlayer
     * 
     * 
     * 
     * @param index
     * @param vMasterPlayer
     */
    public void addMasterPlayer(int index, java.lang.Object vMasterPlayer)
        throws java.lang.IndexOutOfBoundsException
    {
        _masterPlayerList.add(index, vMasterPlayer);
        notifyPropertyChangeListeners("_masterPlayerList", null, _masterPlayerList);
    } //-- void addMasterPlayer(int, java.lang.Object) 

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
     * Method clearMasterPlayer
     * 
     */
    public void clearMasterPlayer()
    {
        _masterPlayerList.clear();
        notifyPropertyChangeListeners("_masterPlayerList", null, _masterPlayerList);
    } //-- void clearMasterPlayer() 

    /**
     * Method enumerateMasterPlayer
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateMasterPlayer()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_masterPlayerList.iterator());
    } //-- java.util.Enumeration enumerateMasterPlayer() 

    /**
     * Returns the value of field 'games'.
     * 
     * @return Games
     * @return the value of field 'games'.
     */
    public ch.form105.shuttle.base.generated.tournament.Games getGames()
    {
        return this._games;
    } //-- ch.form105.shuttle.base.generated.tournament.Games getGames() 

    /**
     * Method getMasterPlayer
     * 
     * 
     * 
     * @param index
     * @return Object
     */
    public java.lang.Object getMasterPlayer(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _masterPlayerList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (java.lang.Object) _masterPlayerList.get(index);
    } //-- java.lang.Object getMasterPlayer(int) 

    /**
     * Method getMasterPlayer
     * 
     * 
     * 
     * @return Object
     */
    public java.lang.Object[] getMasterPlayer()
    {
        int size = _masterPlayerList.size();
        java.lang.Object[] mArray = new java.lang.Object[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (java.lang.Object) _masterPlayerList.get(index);
        }
        return mArray;
    } //-- java.lang.Object[] getMasterPlayer() 

    /**
     * Method getMasterPlayerCount
     * 
     * 
     * 
     * @return int
     */
    public int getMasterPlayerCount()
    {
        return _masterPlayerList.size();
    } //-- int getMasterPlayerCount() 

    /**
     * Returns the value of field 'tournamentName'.
     * 
     * @return String
     * @return the value of field 'tournamentName'.
     */
    public java.lang.String getTournamentName()
    {
        return this._tournamentName;
    } //-- java.lang.String getTournamentName() 

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
     * Method removeMasterPlayer
     * 
     * 
     * 
     * @param vMasterPlayer
     * @return boolean
     */
    public boolean removeMasterPlayer(java.lang.Object vMasterPlayer)
    {
        boolean removed = _masterPlayerList.remove(vMasterPlayer);
        notifyPropertyChangeListeners("_masterPlayerList", null, _masterPlayerList);
        return removed;
    } //-- boolean removeMasterPlayer(java.lang.Object) 

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
     * Sets the value of field 'games'.
     * 
     * @param games the value of field 'games'.
     */
    public void setGames(ch.form105.shuttle.base.generated.tournament.Games games)
    {
        java.lang.Object oldGames = this._games;
        this._games = games;
        notifyPropertyChangeListeners("_games", oldGames, this._games);
    } //-- void setGames(ch.form105.shuttle.base.generated.tournament.Games) 

    /**
     * Method setMasterPlayer
     * 
     * 
     * 
     * @param index
     * @param vMasterPlayer
     */
    public void setMasterPlayer(int index, java.lang.Object vMasterPlayer)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _masterPlayerList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _masterPlayerList.set(index, vMasterPlayer);
        notifyPropertyChangeListeners("_masterPlayerList", null, _masterPlayerList);
    } //-- void setMasterPlayer(int, java.lang.Object) 

    /**
     * Method setMasterPlayer
     * 
     * 
     * 
     * @param masterPlayerArray
     */
    public void setMasterPlayer(java.lang.Object[] masterPlayerArray)
    {
        //-- copy array
        _masterPlayerList.clear();
        for (int i = 0; i < masterPlayerArray.length; i++) {
            _masterPlayerList.add(masterPlayerArray[i]);
        }
        notifyPropertyChangeListeners("_masterPlayerList", null, _masterPlayerList);
    } //-- void setMasterPlayer(java.lang.Object) 

    /**
     * Sets the value of field 'tournamentName'.
     * 
     * @param tournamentName the value of field 'tournamentName'.
     */
    public void setTournamentName(java.lang.String tournamentName)
    {
        java.lang.Object oldTournamentName = this._tournamentName;
        this._tournamentName = tournamentName;
        notifyPropertyChangeListeners("_tournamentName", oldTournamentName, this._tournamentName);
    } //-- void setTournamentName(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Tournament
     */
    public static ch.form105.shuttle.base.generated.tournament.Tournament unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (ch.form105.shuttle.base.generated.tournament.Tournament) Unmarshaller.unmarshal(ch.form105.shuttle.base.generated.tournament.Tournament.class, reader);
    } //-- ch.form105.shuttle.base.generated.tournament.Tournament unmarshal(java.io.Reader) 

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
