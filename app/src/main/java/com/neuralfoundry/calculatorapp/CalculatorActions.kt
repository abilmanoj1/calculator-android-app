package com.neuralfoundry.calculatorapp

sealed class CalculatorActions{
    data class NUmber(val number: Int):CalculatorActions()
    object Clear: CalculatorActions()
    object Delete: CalculatorActions()
    object Decimal: CalculatorActions()
    object Calculate: CalculatorActions()
    data class Operation(val operation: CalculatorOperation): CalculatorActions()
}
