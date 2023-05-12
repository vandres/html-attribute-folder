package ch.voan.htmlattributefolder

import com.intellij.psi.PsiElement

interface Attribute {
    val attribute: PsiElement
    val attributeName: String
}
