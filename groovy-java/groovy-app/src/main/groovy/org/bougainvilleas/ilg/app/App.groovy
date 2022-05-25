/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package org.bougainvilleas.ilg.app

import org.bougainvilleas.ilg.list.LinkedList

import static org.bougainvilleas.ilg.utilities.StringUtils.join
import static org.bougainvilleas.ilg.utilities.StringUtils.split
import static org.bougainvilleas.ilg.app.MessageUtils.getMessage

import org.apache.commons.text.WordUtils

class App {
    static void main(String[] args) {
        LinkedList tokens
        tokens = split(getMessage())
        String result =join(tokens)
        println(WordUtils.capitalize(result))
    }
}
