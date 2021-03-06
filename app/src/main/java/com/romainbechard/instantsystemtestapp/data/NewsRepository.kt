package com.romainbechard.instantsystemtestapp.data

import com.romainbechard.instantsystemtestapp.BuildConfig
import com.romainbechard.instantsystemtestapp.data.model.Article
import com.romainbechard.instantsystemtestapp.data.model.dto.toArticle
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import com.romainbechard.instantsystemtestapp.data.tools.Result
import retrofit2.HttpException

class NewsRepository(
    private val remoteDataSource: NewsDataSource
): Repository {

    override suspend fun getHeadlines(): Result<List<Article>> = remoteDataSource.getHeadlines()

    override suspend fun getSearchResult(subject: String): Result<List<Article>> = remoteDataSource.getSearchResult(subject)

    override fun getSubjects(): List<String> =
        listOf("Sport", "People", "Politique", "Santé", "Divers")
}