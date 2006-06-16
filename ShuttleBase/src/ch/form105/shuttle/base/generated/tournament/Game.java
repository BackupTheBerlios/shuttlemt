/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Game.java,v 1.3 2006/06/16 19:35:26 luschtiger Exp $
 */

package ch.form105.shuttle.base.generated.tournament;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import ch.form105.shuttle.base.generated.tournament.types.GameGameIdType;
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
 * Class Game.
 * 
 * @version $Revision: 1.3 $ $Date: 2006/06/16 19:35:26 $
 */
public class Game extends ch.form105.shuttle.base.Element 
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
     * Field _gameId
     */
    private ch.form105.shuttle.base.generated.tournament.types.GameGameIdType _gameId;

    /**
     * Field _active
     */
    private boolean _active;

    /**
     * keeps track of state for field: _active
     */
    private boolean _has_active;

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _categoryList
     */
    private java.util.ArrayList _categoryList;

    /**
     * Field propertyChangeSupport
     */
    private java.beans.PropertyChangeSupport propertyChangeSupport;


      //----------------/
     //- Constructors -/
    //----------------/

    public Game() 
     {
        super();
        _categoryList = new ArrayList();
    } //-- ch.form105.shuttle.base.generated.tournament.Game()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addCategory
     * 
     * 
     * 
     * @param vCategory
     */
    public void addCategory(ch.form105.shuttle.base.generated.tournament.Category vCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        _categoryList.add(vCategory);
        notifyPropertyChangeListeners("_categoryList", null, _categoryList);
    } //-- void addCategory(ch.form105.shuttle.base.generated.tournament.Category) 

    /**
     * Method addCategory
     * 
     * 
     * 
     * @param index
     * @param vCategory
     */
    public void addCategory(int index, ch.form105.shuttle.base.generated.tournament.Category vCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        _categoryList.add(index, vCategory);
        notifyPropertyChangeListeners("_categoryList", null, _categoryList);
    } //-- void addCategory(int, ch.form105.shuttle.base.generated.tournament.Category) 

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
     * Method clearCategory
     * 
     */
    public void clearCategory()
    {
        _categoryList.clear();
        notifyPropertyChangeListeners("_categoryList", null, _categoryList);
    } //-- void clearCategory() 

    /**
     * Method deleteActive
     * 
     */
    public void deleteActive()
    {
        this._has_active= false;
        notifyPropertyChangeListeners("_active", (this._active ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE), null);
    } //-- void deleteActive() 

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
     * Method enumerateCategory
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateCategory()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_categoryList.iterator());
    } //-- java.util.Enumeration enumerateCategory() 

    /**
     * Returns the value of field 'active'.
     * 
     * @return boolean
     * @return the value of field 'active'.
     */
    public boolean getActive()
    {
        return this._active;
    } //-- boolean getActive() 

    /**
     * Method getCategory
     * 
     * 
     * 
     * @param index
     * @return Category
     */
    public ch.form105.shuttle.base.generated.tournament.Category getCategory(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _categoryList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (ch.form105.shuttle.base.generated.tournament.Category) _categoryList.get(index);
    } //-- ch.form105.shuttle.base.generated.tournament.Category getCategory(int) 

    /**
     * Method getCategory
     * 
     * 
     * 
     * @return Category
     */
    public ch.form105.shuttle.base.generated.tournament.Category[] getCategory()
    {
        int size = _categoryList.size();
        ch.form105.shuttle.base.generated.tournament.Category[] mArray = new ch.form105.shuttle.base.generated.tournament.Category[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (ch.form105.shuttle.base.generated.tournament.Category) _categoryList.get(index);
        }
        return mArray;
    } //-- ch.form105.shuttle.base.generated.tournament.Category[] getCategory() 

    /**
     * Method getCategoryCount
     * 
     * 
     * 
     * @return int
     */
    public int getCategoryCount()
    {
        return _categoryList.size();
    } //-- int getCategoryCount() 

    /**
     * Returns the value of field 'gameId'.
     * 
     * @return GameGameIdType
     * @return the value of field 'gameId'.
     */
    public ch.form105.shuttle.base.generated.tournament.types.GameGameIdType getGameId()
    {
        return this._gameId;
    } //-- ch.form105.shuttle.base.generated.tournament.types.GameGameIdType getGameId() 

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
     * Method hasActive
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasActive()
    {
        return this._has_active;
    } //-- boolean hasActive() 

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
     * Method removeCategory
     * 
     * 
     * 
     * @param vCategory
     * @return boolean
     */
    public boolean removeCategory(ch.form105.shuttle.base.generated.tournament.Category vCategory)
    {
        boolean removed = _categoryList.remove(vCategory);
        notifyPropertyChangeListeners("_categoryList", null, _categoryList);
        return removed;
    } //-- boolean removeCategory(ch.form105.shuttle.base.generated.tournament.Category) 

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
     * Sets the value of field 'active'.
     * 
     * @param active the value of field 'active'.
     */
    public void setActive(boolean active)
    {
        java.lang.Object oldActive = (this._active ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE);
        this._active = active;
        this._has_active = true;
        notifyPropertyChangeListeners("_active", oldActive, (this._active ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
    } //-- void setActive(boolean) 

    /**
     * Method setCategory
     * 
     * 
     * 
     * @param index
     * @param vCategory
     */
    public void setCategory(int index, ch.form105.shuttle.base.generated.tournament.Category vCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _categoryList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _categoryList.set(index, vCategory);
        notifyPropertyChangeListeners("_categoryList", null, _categoryList);
    } //-- void setCategory(int, ch.form105.shuttle.base.generated.tournament.Category) 

    /**
     * Method setCategory
     * 
     * 
     * 
     * @param categoryArray
     */
    public void setCategory(ch.form105.shuttle.base.generated.tournament.Category[] categoryArray)
    {
        //-- copy array
        _categoryList.clear();
        for (int i = 0; i < categoryArray.length; i++) {
            _categoryList.add(categoryArray[i]);
        }
        notifyPropertyChangeListeners("_categoryList", null, _categoryList);
    } //-- void setCategory(ch.form105.shuttle.base.generated.tournament.Category) 

    /**
     * Sets the value of field 'gameId'.
     * 
     * @param gameId the value of field 'gameId'.
     */
    public void setGameId(ch.form105.shuttle.base.generated.tournament.types.GameGameIdType gameId)
    {
        java.lang.Object oldGameId = this._gameId;
        this._gameId = gameId;
        notifyPropertyChangeListeners("_gameId", oldGameId, this._gameId);
    } //-- void setGameId(ch.form105.shuttle.base.generated.tournament.types.GameGameIdType) 

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
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Game
     */
    public static ch.form105.shuttle.base.generated.tournament.Game unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (ch.form105.shuttle.base.generated.tournament.Game) Unmarshaller.unmarshal(ch.form105.shuttle.base.generated.tournament.Game.class, reader);
    } //-- ch.form105.shuttle.base.generated.tournament.Game unmarshal(java.io.Reader) 

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
