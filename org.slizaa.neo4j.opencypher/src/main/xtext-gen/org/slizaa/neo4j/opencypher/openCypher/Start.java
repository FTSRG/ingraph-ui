/**
 * generated by Xtext 2.13.0
 */
package org.slizaa.neo4j.opencypher.openCypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.Start#getStartPoint <em>Start Point</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.Start#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getStart()
 * @model
 * @generated
 */
public interface Start extends Clause
{
  /**
   * Returns the value of the '<em><b>Start Point</b></em>' containment reference list.
   * The list contents are of type {@link org.slizaa.neo4j.opencypher.openCypher.StartPoint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Point</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Point</em>' containment reference list.
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getStart_StartPoint()
   * @model containment="true"
   * @generated
   */
  EList<StartPoint> getStartPoint();

  /**
   * Returns the value of the '<em><b>Where</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where</em>' containment reference.
   * @see #setWhere(Where)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getStart_Where()
   * @model containment="true"
   * @generated
   */
  Where getWhere();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.Start#getWhere <em>Where</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where</em>' containment reference.
   * @see #getWhere()
   * @generated
   */
  void setWhere(Where value);

} // Start
