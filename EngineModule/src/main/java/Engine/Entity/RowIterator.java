package Engine.Entity;

import Engine.Exceptions.DamagedDataException;

/**
 * The type Block iterator.
 */
public class RowIterator {

    private final TableBlockContainer container;
    private int currentPage = 0;
    private int pagesCount = 0;
    private int currentRowIndex = 0;
    private Page page;
    private Row currentRow = null;

    /**
     * Instantiates a new Block iterator.
     *
     * @param container  the container
     * @param pagesCount the pages count
     */
    public RowIterator(TableBlockContainer container, int pagesCount) {
        this.container = container;
        this.pagesCount = pagesCount;
    }

    /**
     * Iterates to next row.
     *
     * @return *false* if has no next row
     */
    public boolean next() throws DamagedDataException {
        if (page != null && currentRowIndex < page.getRows().size()) {
            currentRowIndex++;
            currentRow = page.getRows().get(currentRowIndex);
            return true;
        }

        if (hasNextPage()) {
            currentRowIndex = 0;
            currentPage++;
            page = container.getPageByIndex(currentPage);
            currentRow = page.getRows().get(currentRowIndex);
            return true;
        }

        return false;
    }

    /**
     * Has next row.
     *
     * @return the boolean
     */
    public boolean hasNextPage() {
        return currentPage < pagesCount;
    }

    /**
     * Updates current row.
     */
    public void update(Row row) {
        this.currentRow = row;
    }

    /**
     * Delete.
     */
    public void delete() {
    }

    public Row getCurrentRow() {
        return currentRow;
    }
}
