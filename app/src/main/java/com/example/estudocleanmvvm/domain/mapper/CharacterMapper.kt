package com.example.estudocleanmvvm.domain.mapper

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.charactersrickandmorty.domain.model.*
import com.example.estudocleanmvvm.data.models.CharacterResponse
import com.example.estudocleanmvvm.data.models.Results
import com.example.estudocleanmvvm.utils.Mapper

@RequiresApi(Build.VERSION_CODES.N)
class CharacterMapper : Mapper<CharacterResponse, Characters> {
   /* override fun apply(response: CharacterResponse): Characters {
       return Characters(
           info = Info(),
           results = mapResults(response.results),
       )
    }*/

    private fun mapResults(statusResult: List<Results>): List<CharactersResult>{
     return statusResult.map{
         CharactersResult(
             created = it.created,
             episode = it.episode,
             gender = it.gender,
             id = it.id,
             image = it.image,
             name = it.name,
             species = it.species,
             status = it.status,
             type = it.type,
             url = it.url,
             location = com.example.charactersrickandmorty.domain.model.Location(name = "",url =""),
             origin = Origin(name = "", url = "")
         )
     }
 }

    override fun map(source: CharacterResponse): Characters {
        return Characters(
            info = Info(),
            results = mapResults(source.results),
        )
    }
}
 /*   private fun mapLocation(statusLocation: Location): com.example.charactersrickandmorty.domain.model.Location{
        return statusLocation.map{
            Location(
                name = it.name,
                url = it.url,
            )
        }
}*/
/*
    val charactersResult: List <CharactersResult> = charactersResult()

internal fun  charactersResultsResponse(): Characters {
    return Characters(
        Info(),
        results = charactersResult
    )
}

*/
/*public inline fun <T> MutableList(size: Int, init: (index: Int) -> T): MutableList<T> {
    val list = ArrayList<T>(size)
    repeat(size) { index -> list.add(init(index)) }
    return list
}*//*




internal fun Location.toMovieItemResult(): Location {
    return Location(
        name,
        url
        )
}
internal fun Origin.toMovieItemResult(): Origin {
    return Origin(
        name,
        url
        )
}
internal fun Info.toMovieItemResult(): Info {
    return Info(
    count,
    next,
    pages,
    prev
        )
}
internal fun charactersResult(): List<CharactersResult> {
    return listOf(
        CharactersResult(
        created ,
        episode = episode,
        gender = gender,
        id = id,
        image = image,
        location = location,
        name = name,
        origin = origin,
        species = species,
        status = status,
        type = type,
        url = url
    ))
}



internal fun List<Result>.toMovieItemResult(): List<Result> {
    val charactersList = arrayListOf<Result>()

    for (index in this.indices) {
        charactersList.add(
            Result(
                created = this[index].created,
                episode = this[index].episode,
                gender = this[index].gender,
                id = this[index].id,
                image = this[index].image,
                location = Location(this[index].name, this[index].url),
                name = this[index].name,
                origin = Origin(this[index].name, this[index].url),
                species = this[index].species,
                status = this[index].status,
                type = this[index].type,
                url = this[index].url,
            )
        )
    }
    return charactersList
}


*/
/*
public inline fun <Result> list(size: Int, init: (index: Int) -> com.example.charactersrickandmorty.domain.model.Result): MutableList<com.example.charactersrickandmorty.domain.model.Result> {
    val list = ArrayList<com.example.charactersrickandmorty.domain.model.Result>(size)
    repeat(size) { index -> list.add(init(index)) }
    return list
}
public inline fun <Result> test(size: Int, init: (index: Int) -> Result): MutableList<Result> {
    val charactersList = arrayListOf<Result>()

    repeat(size) {
        for (index in this.indices)
        charactersList.add(
            Result(
                created = this[index].created,
                episode = this[index].episode,
                gender = this[index].gender,
                id = this[index].id,
                image = this[index].image,
                location = Location(this[index].name, this[index].url),
                name = this[index].name,
                origin = Origin(this[index].name, this[index].url),
                species = this[index].species,
                status = this[index].status,
                type = this[index].type,
                url = this[index].url,
            )
        ) }
    *//*

*/
/*for (index in this.indices) {
        charactersList.add(
            Result(
                created = MutableList()[index].created,
                episode = this[index].episode,
                gender = this[index].gender,
                id = this[index].id,
                image = this[index].image,
                location = Location(this[index].name, this[index].url),
                name = this[index].name,
                origin = Origin(this[index].name, this[index].url),
                species = this[index].species,
                status = this[index].status,
                type = this[index].type,
                url = this[index].url,
            )
        )
    }*//*
*/
/*

    return charactersList
}*//*

