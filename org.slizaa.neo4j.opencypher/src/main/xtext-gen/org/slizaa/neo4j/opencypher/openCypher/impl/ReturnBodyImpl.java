/**
 * generated by Xtext 2.13.0
 */
package org.slizaa.neo4j.opencypher.openCypher.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.slizaa.neo4j.opencypher.openCypher.Limit;
import org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage;
import org.slizaa.neo4j.opencypher.openCypher.Order;
import org.slizaa.neo4j.opencypher.openCypher.ReturnBody;
import org.slizaa.neo4j.opencypher.openCypher.ReturnItems;
import org.slizaa.neo4j.opencypher.openCypher.Skip;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.ReturnBodyImpl#getReturnItems <em>Return Items</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.ReturnBodyImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.ReturnBodyImpl#getSkip <em>Skip</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.ReturnBodyImpl#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnBodyImpl extends MinimalEObjectImpl.Container implements ReturnBody
{
  /**
   * The cached value of the '{@link #getReturnItems() <em>Return Items</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnItems()
   * @generated
   * @ordered
   */
  protected ReturnItems returnItems;

  /**
   * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected Order order;

  /**
   * The cached value of the '{@link #getSkip() <em>Skip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSkip()
   * @generated
   * @ordered
   */
  protected Skip skip;

  /**
   * The cached value of the '{@link #getLimit() <em>Limit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimit()
   * @generated
   * @ordered
   */
  protected Limit limit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReturnBodyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OpenCypherPackage.Literals.RETURN_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnItems getReturnItems()
  {
    return returnItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnItems(ReturnItems newReturnItems, NotificationChain msgs)
  {
    ReturnItems oldReturnItems = returnItems;
    returnItems = newReturnItems;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.RETURN_BODY__RETURN_ITEMS, oldReturnItems, newReturnItems);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnItems(ReturnItems newReturnItems)
  {
    if (newReturnItems != returnItems)
    {
      NotificationChain msgs = null;
      if (returnItems != null)
        msgs = ((InternalEObject)returnItems).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.RETURN_BODY__RETURN_ITEMS, null, msgs);
      if (newReturnItems != null)
        msgs = ((InternalEObject)newReturnItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.RETURN_BODY__RETURN_ITEMS, null, msgs);
      msgs = basicSetReturnItems(newReturnItems, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.RETURN_BODY__RETURN_ITEMS, newReturnItems, newReturnItems));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Order getOrder()
  {
    return order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrder(Order newOrder, NotificationChain msgs)
  {
    Order oldOrder = order;
    order = newOrder;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.RETURN_BODY__ORDER, oldOrder, newOrder);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrder(Order newOrder)
  {
    if (newOrder != order)
    {
      NotificationChain msgs = null;
      if (order != null)
        msgs = ((InternalEObject)order).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.RETURN_BODY__ORDER, null, msgs);
      if (newOrder != null)
        msgs = ((InternalEObject)newOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.RETURN_BODY__ORDER, null, msgs);
      msgs = basicSetOrder(newOrder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.RETURN_BODY__ORDER, newOrder, newOrder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Skip getSkip()
  {
    return skip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSkip(Skip newSkip, NotificationChain msgs)
  {
    Skip oldSkip = skip;
    skip = newSkip;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.RETURN_BODY__SKIP, oldSkip, newSkip);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSkip(Skip newSkip)
  {
    if (newSkip != skip)
    {
      NotificationChain msgs = null;
      if (skip != null)
        msgs = ((InternalEObject)skip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.RETURN_BODY__SKIP, null, msgs);
      if (newSkip != null)
        msgs = ((InternalEObject)newSkip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.RETURN_BODY__SKIP, null, msgs);
      msgs = basicSetSkip(newSkip, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.RETURN_BODY__SKIP, newSkip, newSkip));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Limit getLimit()
  {
    return limit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLimit(Limit newLimit, NotificationChain msgs)
  {
    Limit oldLimit = limit;
    limit = newLimit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.RETURN_BODY__LIMIT, oldLimit, newLimit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLimit(Limit newLimit)
  {
    if (newLimit != limit)
    {
      NotificationChain msgs = null;
      if (limit != null)
        msgs = ((InternalEObject)limit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.RETURN_BODY__LIMIT, null, msgs);
      if (newLimit != null)
        msgs = ((InternalEObject)newLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.RETURN_BODY__LIMIT, null, msgs);
      msgs = basicSetLimit(newLimit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.RETURN_BODY__LIMIT, newLimit, newLimit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OpenCypherPackage.RETURN_BODY__RETURN_ITEMS:
        return basicSetReturnItems(null, msgs);
      case OpenCypherPackage.RETURN_BODY__ORDER:
        return basicSetOrder(null, msgs);
      case OpenCypherPackage.RETURN_BODY__SKIP:
        return basicSetSkip(null, msgs);
      case OpenCypherPackage.RETURN_BODY__LIMIT:
        return basicSetLimit(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OpenCypherPackage.RETURN_BODY__RETURN_ITEMS:
        return getReturnItems();
      case OpenCypherPackage.RETURN_BODY__ORDER:
        return getOrder();
      case OpenCypherPackage.RETURN_BODY__SKIP:
        return getSkip();
      case OpenCypherPackage.RETURN_BODY__LIMIT:
        return getLimit();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OpenCypherPackage.RETURN_BODY__RETURN_ITEMS:
        setReturnItems((ReturnItems)newValue);
        return;
      case OpenCypherPackage.RETURN_BODY__ORDER:
        setOrder((Order)newValue);
        return;
      case OpenCypherPackage.RETURN_BODY__SKIP:
        setSkip((Skip)newValue);
        return;
      case OpenCypherPackage.RETURN_BODY__LIMIT:
        setLimit((Limit)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OpenCypherPackage.RETURN_BODY__RETURN_ITEMS:
        setReturnItems((ReturnItems)null);
        return;
      case OpenCypherPackage.RETURN_BODY__ORDER:
        setOrder((Order)null);
        return;
      case OpenCypherPackage.RETURN_BODY__SKIP:
        setSkip((Skip)null);
        return;
      case OpenCypherPackage.RETURN_BODY__LIMIT:
        setLimit((Limit)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OpenCypherPackage.RETURN_BODY__RETURN_ITEMS:
        return returnItems != null;
      case OpenCypherPackage.RETURN_BODY__ORDER:
        return order != null;
      case OpenCypherPackage.RETURN_BODY__SKIP:
        return skip != null;
      case OpenCypherPackage.RETURN_BODY__LIMIT:
        return limit != null;
    }
    return super.eIsSet(featureID);
  }

} //ReturnBodyImpl
