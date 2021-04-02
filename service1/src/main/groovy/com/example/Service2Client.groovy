package com.example

import com.example.domain.Book
import com.example.service.fallback.Service2ClientFallbackService
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.micronaut.retry.annotation.Recoverable
import io.reactivex.Flowable

@Client(id = "service2")
@Recoverable(api = Service2Client.class)
interface Service2Client {
    @Get("/books")
    Flowable<ArrayList<Book>> findBooks();
}