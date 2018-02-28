/**
 * generated by Xtext 2.13.0
 */
package org.slizaa.neo4j.opencypher.openCypher.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.slizaa.neo4j.opencypher.openCypher.NodePattern;
import org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage;
import org.slizaa.neo4j.opencypher.openCypher.PatternElementChain;
import org.slizaa.neo4j.opencypher.openCypher.RelationshipsPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationships Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.RelationshipsPatternImpl#getNodePattern <em>Node Pattern</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.RelationshipsPatternImpl#getChain <em>Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipsPatternImpl extends ExpressionImpl implements RelationshipsPattern
{
  /**
   * The cached value of the '{@link #getNodePattern() <em>Node Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodePattern()
   * @generated
   * @ordered
   */
  protected NodePattern nodePattern;

  /**
   * The cached value of the '{@link #getChain() <em>Chain</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChain()
   * @generated
   * @ordered
   */
  protected EList<PatternElementChain> chain;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationshipsPatternImpl()
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
    return OpenCypherPackage.Literals.RELATIONSHIPS_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodePattern getNodePattern()
  {
    return nodePattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNodePattern(NodePattern newNodePattern, NotificationChain msgs)
  {
    NodePattern oldNodePattern = nodePattern;
    nodePattern = newNodePattern;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.RELATIONSHIPS_PATTERN__NODE_PATTERN, oldNodePattern, newNodePattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodePattern(NodePattern newNodePattern)
  {
    if (newNodePattern != nodePattern)
    {
      NotificationChain msgs = null;
      if (nodePattern != null)
        msgs = ((InternalEObject)nodePattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.RELATIONSHIPS_PATTERN__NODE_PATTERN, null, msgs);
      if (newNodePattern != null)
        msgs = ((InternalEObject)newNodePattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.RELATIONSHIPS_PATTERN__NODE_PATTERN, null, msgs);
      msgs = basicSetNodePattern(newNodePattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.RELATIONSHIPS_PATTERN__NODE_PATTERN, newNodePattern, newNodePattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PatternElementChain> getChain()
  {
    if (chain == null)
    {
      chain = new EObjectContainmentEList<PatternElementChain>(PatternElementChain.class, this, OpenCypherPackage.RELATIONSHIPS_PATTERN__CHAIN);
    }
    return chain;
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
      case OpenCypherPackage.RELATIONSHIPS_PATTERN__NODE_PATTERN:
        return basicSetNodePattern(null, msgs);
      case OpenCypherPackage.RELATIONSHIPS_PATTERN__CHAIN:
        return ((InternalEList<?>)getChain()).basicRemove(otherEnd, msgs);
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
      case OpenCypherPackage.RELATIONSHIPS_PATTERN__NODE_PATTERN:
        return getNodePattern();
      case OpenCypherPackage.RELATIONSHIPS_PATTERN__CHAIN:
        return getChain();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OpenCypherPackage.RELATIONSHIPS_PATTERN__NODE_PATTERN:
        setNodePattern((NodePattern)newValue);
        return;
      case OpenCypherPackage.RELATIONSHIPS_PATTERN__CHAIN:
        getChain().clear();
        getChain().addAll((Collection<? extends PatternElementChain>)newValue);
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
      case OpenCypherPackage.RELATIONSHIPS_PATTERN__NODE_PATTERN:
        setNodePattern((NodePattern)null);
        return;
      case OpenCypherPackage.RELATIONSHIPS_PATTERN__CHAIN:
        getChain().clear();
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
      case OpenCypherPackage.RELATIONSHIPS_PATTERN__NODE_PATTERN:
        return nodePattern != null;
      case OpenCypherPackage.RELATIONSHIPS_PATTERN__CHAIN:
        return chain != null && !chain.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RelationshipsPatternImpl
