package com.example

import com.example.domain.Book
import com.example.service.fallback.Service2ClientFallbackService
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.micronaut.retry.annotation.Recoverable
import io.reactivex.Flowable

interface Service2Client {
    Flowable<ArrayList<Book>> findBooks();
}