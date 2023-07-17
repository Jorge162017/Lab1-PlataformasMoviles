class ItemData(private val originalValue: Any?) {

    // Función getType
    fun getType(): String? {
        return when (originalValue) {
            is String -> "cadena"
            is Int -> "entero"
            is Boolean -> "booleano"
            else -> null
        }
    }

    // Función getInfo
    fun getInfo(): String? {
        return when (originalValue) {
            is String -> {
                val stringValue = originalValue as String
                "L${stringValue.length}"
            }
            is Int -> {
                val intValue = originalValue as Int
                when {
                    intValue % 10 == 0 -> "M10"
                    intValue % 5 == 0 -> "M5"
                    intValue % 2 == 0 -> "M2"
                    else -> null
                }
            }
            is Boolean -> {
                val boolValue = originalValue as Boolean
                if (boolValue) {
                    "Verdadero"
                } else {
                    "Falso"
                }
            }
            else -> null
        }
    }
}

