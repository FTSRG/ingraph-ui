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

import org.slizaa.neo4j.opencypher.openCypher.Expression;
import org.slizaa.neo4j.opencypher.openCypher.ExpressionNodeLabels;
import org.slizaa.neo4j.opencypher.openCypher.NodeLabel;
import org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Node Labels</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.ExpressionNodeLabelsImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.ExpressionNodeLabelsImpl#getNodeLabels <em>Node Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionNodeLabelsImpl extends ExpressionImpl implements ExpressionNodeLabels
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Expression left;

  /**
   * The cached value of the '{@link #getNodeLabels() <em>Node Labels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeLabels()
   * @generated
   * @ordered
   */
  protected EList<NodeLabel> nodeLabels;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionNodeLabelsImpl()
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
    return OpenCypherPackage.Literals.EXPRESSION_NODE_LABELS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs)
  {
    Expression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.EXPRESSION_NODE_LABELS__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Expression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.EXPRESSION_NODE_LABELS__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.EXPRESSION_NODE_LABELS__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.EXPRESSION_NODE_LABELS__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NodeLabel> getNodeLabels()
  {
    if (nodeLabels == null)
    {
      nodeLabels = new EObjectContainmentEList<NodeLabel>(NodeLabel.class, this, OpenCypherPackage.EXPRESSION_NODE_LABELS__NODE_LABELS);
    }
    return nodeLabels;
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
      case OpenCypherPackage.EXPRESSION_NODE_LABELS__LEFT:
        return basicSetLeft(null, msgs);
      case OpenCypherPackage.EXPRESSION_NODE_LABELS__NODE_LABELS:
        return ((InternalEList<?>)getNodeLabels()).basicRemove(otherEnd, msgs);
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
      case OpenCypherPackage.EXPRESSION_NODE_LABELS__LEFT:
        return getLeft();
      case OpenCypherPackage.EXPRESSION_NODE_LABELS__NODE_LABELS:
        return getNodeLabels();
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
      case OpenCypherPackage.EXPRESSION_NODE_LABELS__LEFT:
        setLeft((Expression)newValue);
        return;
      case OpenCypherPackage.EXPRESSION_NODE_LABELS__NODE_LABELS:
        getNodeLabels().clear();
        getNodeLabels().addAll((Collection<? extends NodeLabel>)newValue);
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
      case OpenCypherPackage.EXPRESSION_NODE_LABELS__LEFT:
        setLeft((Expression)null);
        return;
      case OpenCypherPackage.EXPRESSION_NODE_LABELS__NODE_LABELS:
        getNodeLabels().clear();
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
      case OpenCypherPackage.EXPRESSION_NODE_LABELS__LEFT:
        return left != null;
      case OpenCypherPackage.EXPRESSION_NODE_LABELS__NODE_LABELS:
        return nodeLabels != null && !nodeLabels.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExpressionNodeLabelsImpl
