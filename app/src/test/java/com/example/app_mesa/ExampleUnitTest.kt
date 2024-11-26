package com.example.app_mesa

import com.example.app_mesa.character.Character
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CharacterUnitTest {
    val character = Character();

    @Test
    fun `O level de energia inicial de um personagem novo deve ser 100`() {
        assertEquals(100, character.energyLevel);
    }
    @Test
    fun `O level de comida inicial de um personagem novo deve ser 100`() {
        assertEquals(100, character.foodLevel);
    }
    @Test
    fun `O level de felicidade de um personagem novo deve ser 100`() {
        assertEquals(100, character.happinessLevel);
    }
    @Test
    fun `O level de vida de um personagem novo deve ser 100`() {
        assertEquals(100, character.healthLevel);
    }

    @Test
    fun `Os levels devem ser reduzidos proporcionalmente ao tempo passado`() {
        character.updateCharacter(10)
        assertEquals(95, character.foodLevel)
        assertEquals(95, character.happinessLevel)
        assertEquals(95, character.energyLevel)
        assertEquals(95, character.healthLevel)
    }

    @Test
    fun `Os levels devem ser 0 caso passe tempo sufiente para zerar`() {
        character.updateCharacter(200)
        assertEquals(0, character.foodLevel)
        assertEquals(0, character.happinessLevel)
        assertEquals(0, character.energyLevel)
        assertEquals(0, character.healthLevel)
    }

    @Test
    fun `O level nao pode ser negativo quando o tempo for muito grande`() {
        character.updateCharacter(1000)
        assertEquals(0, character.foodLevel)
        assertEquals(0, character.happinessLevel)
        assertEquals(0, character.energyLevel)
        assertEquals(0, character.healthLevel)
    }


}