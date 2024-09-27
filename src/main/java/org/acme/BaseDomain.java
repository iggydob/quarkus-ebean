package org.acme;

import io.ebean.annotation.NotNull;
import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;

import java.time.ZonedDateTime;
import java.util.UUID;

/**
 * A best practice is to implement @MappedSuperclass to hold common properties. A common mapped superclass might be:
 */
@MappedSuperclass
public abstract class BaseDomain {
    /**
     * <p>When we annotate a property with <code>@Id</code> Ebean will automatically assign an
     * appropriate <code>Id</code> generator if the type is a <code>number</code> type or <code>UUID</code> type.
     * <p> That is, with Ebean it is effectively redundant to also add the <code>@GeneratedValue</code> annotation.
     * <p> This behaviour can be disabled using idGeneratorAutomatic configuration property.
     */
    @Id
    @NotNull
    private UUID id;

    /**
     * <p>Mapping for a property that provides optimistic locking. The version property can either be a number type like long or a timestamp type like Instant.
     * <p><bold>Recommendation</bold>
     * <p>The recommendation is to map @Version to a property of type long and then additionally map a property using <code>@WhenModified</code>.
     */
    @Version
    private Long version;

    /**
     * <p>A date time property managed by Ebean that is set on insert only.
     * <p>Typically we use both @WhenCreated and @WhenModified on a mapped superclass.
     */
    @WhenCreated
    @Column (name = "when_created")
    private ZonedDateTime whenCreated;

    /**
     * <p>A date time property managed by Ebean that is set on both insert and update.
     * <p>Typically we use both <code>@WhenCreated</code> and <code>@WhenModified</code> on a mapped superclass.
     */
    @WhenModified
    @Column (name = "when_modified")
    private ZonedDateTime whenModified;
}
