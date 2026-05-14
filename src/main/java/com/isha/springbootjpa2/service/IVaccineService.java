package com.isha.springbootjpa2.service;

import com.isha.springbootjpa2.entity.Vaccine;

import java.util.List;

public interface IVaccineService
{
public Iterable<Vaccine> fetchDetailsBySorting(boolean status,String...properties);
/*
pagination :
Instead of fetching ALL records from database at once,
you fetch data in small pages/chunks.

Example:
Page 1 → first 5 records
Page 2 → next 5 records
Page 3 → next 5 records

Just like:
Google search pages
Instagram feed loading
Amazon product pages

Suppose database has:
10,00,000 records

If you do:
repo.findAll();
then ALL records load into memory

Bad for:
performance
memory
speed

So pagination solves this.
 */

    public List<Vaccine> fetchDetailsByPagination(int pNo, int pSize,boolean status, String...properties);
}
