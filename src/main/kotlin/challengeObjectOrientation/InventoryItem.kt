package challengeObjectOrientation

abstract class InventoryItem(val title: String, val genre: String, val publicationYear: Int, var inLibrary: Boolean) : Lendable {
}