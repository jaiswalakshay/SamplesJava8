package com.jaiswalakshay.pairiterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;

public class PairIterator {
	public static <T> void pairIterator(Iterable<T> iterable, BiConsumer<T, T> consumer) {
		Iterator<T> it = iterable.iterator();
		if (!it.hasNext())
			return;
		T first = it.next();

		while (it.hasNext()) {
			T next = it.next();
			consumer.accept(first, next);
			first = next;
		}
	}

	public static void main(String[] args) {
		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		pairIterator(listOfNumbers, (x, y) -> {
			System.out.println(x + " " + y);
		});
	}
}
