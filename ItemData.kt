class ItemData(var originalValue: Any?) {
    fun ItemDataJ(originalValue: Any) {
        this.originalValue = originalValue
    }

    fun getType(): String? {
        return if (this.originalValue is String) {
            "cadena"
        } else if (this.originalValue is Int) {
            "entero"
        } else if (this.originalValue is Boolean) {
            "booleano"
        } else {
            null
        }
    }

    fun getInfo(): String? {
        return if (this.originalValue is String) {
            val sv = this.originalValue as String
            "L" + sv.length
        } else if (this.originalValue is Int) {
            val iv = this.originalValue as Int
            if (iv % 10 == 0) {
                "M10"
            } else if (iv % 5 == 0) {
                "M5"
            } else if (iv % 2 == 0) {
                "M2"
            } else {
                null
            }
        } else if (this.originalValue is Boolean) {
            val bv = this.originalValue as Boolean
            if (bv) {
                "Verdadero"
            } else {
                "Falso"
            }
        } else {
            null
        }
    }
}