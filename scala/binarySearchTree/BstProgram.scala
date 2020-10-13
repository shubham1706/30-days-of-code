package practice.binarySearchTree

object BstProgram extends App {
  val bst = new BST()
  bst.addNode(50)
  bst.addNode(10)
  bst.addNode(30)
  bst.addNode(5)
  bst.addNode(6)
  bst.addNode(4)
  bst.addNode(80)
  bst.addNode(100)
  bst.addNode(70)
  bst.addNode(90)
  bst.addNode(80)
  bst.printInOrderTraversal()
  bst.printPostOrderTraversal()
  bst.printPreOrderTraversal()
}
